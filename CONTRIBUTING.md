# Contributing

Report bugs and request features in
[GitHub issues](https://github.com/vaifstudio/vaif-java/issues). Include the SDK
and Java versions, operating system, a minimal reproduction, the expected and
actual results, and the error code and request ID when available. Remove
credentials and customer data. Report vulnerabilities privately as described in
[SECURITY.md](SECURITY.md).

This repository is an exported copy of the SDK maintained in VAIF Studio's main
source repository. Maintainers review pull requests here, apply accepted
changes to that source, credit contributors, and include them in the next
export. Exports are committed on top of this repository's history. Discuss
larger changes in an issue first.

## Building

Use JDK 17 or later and the Gradle wrapper:

```sh
./gradlew --no-daemon build
```

`build` compiles for Java 11, runs the tests, checks formatting with
google-java-format, and builds Javadoc with full doclint and warnings treated
as errors. To reformat the sources:

```sh
./gradlew --no-daemon formatJava
```

## Dependencies

Gradle locks every dependency configuration in `gradle.lockfile`. After an
intentional dependency change, update the lockfile, review it, and scan it:

```sh
./gradlew --no-daemon dependencies --write-locks
osv-scanner scan source --lockfile=gradle.lockfile
```

Any known vulnerability fails CI. The Gradle wrapper verifies the distribution's
SHA-256 checksum.

## Changes

Add a regression test for every behavior change; tests assert exact values.
Public types and members need Javadoc.
`src/main/java/studio/vaif/sdk/generated/Operations.java` and
`src/main/java/studio/vaif/sdk/StaffOnlyRoutes.java` are generated from the API
contract; do not edit them. Describe the contract change you need in an issue or
pull request instead.

Contributions follow [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) and are licensed
under the [MIT License](LICENSE).
