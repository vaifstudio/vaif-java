package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.tools.ToolProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** Compiles every Java example in README.md against the SDK for Java 11. */
class DocumentationTest {
  private static final int README_EXAMPLES = 10;

  @TempDir Path directory;

  @Test
  void readmeExamplesCompile() throws IOException, URISyntaxException {
    Path readme = Paths.get(System.getProperty("vaif.package", "."), "README.md");
    Matcher samples =
        Pattern.compile("```java\\n(.*?)```", Pattern.DOTALL).matcher(Files.readString(readme));
    List<String> files = new ArrayList<>();
    while (samples.find()) {
      String source = samples.group(1);
      String name = "Example";
      if (!source.contains("class Example")) {
        // The README states that snippets assume these two imports.
        name = "Snippet" + files.size();
        source =
            "import studio.vaif.sdk.*;\nimport java.util.*;\n\nclass "
                + name
                + " {\n"
                + source
                + "}\n";
      }
      Path file = directory.resolve(name + ".java");
      Files.writeString(file, source, StandardCharsets.UTF_8);
      files.add(file.toString());
    }
    assertEquals(README_EXAMPLES, files.size());

    // Gradle test workers load the SDK through an isolated class loader.
    String sdkClasses =
        Paths.get(VaifClient.class.getProtectionDomain().getCodeSource().getLocation().toURI())
            .toString();
    String classpath = System.getProperty("java.class.path") + File.pathSeparator + sdkClasses;
    List<String> options =
        new ArrayList<>(
            List.of(
                "--release",
                "11",
                "-Xlint:all",
                "-Werror",
                "-cp",
                classpath,
                "-d",
                directory.toString()));
    options.addAll(files);
    int result =
        ToolProvider.getSystemJavaCompiler().run(null, null, null, options.toArray(new String[0]));
    assertEquals(0, result, "README Java examples did not compile");
  }
}
