# Security policy

Report vulnerabilities privately, through the "Report a vulnerability" form on
this repository's Security tab (GitHub private vulnerability reporting) or by
email to security@vaif.studio. Do not open a public issue or pull request for a
vulnerability. Include the SDK version, Java
version, operating system, impact, and a minimal reproduction. Remove
credentials, signed URLs, and customer data from every report. Test only
against projects and accounts you own.

We acknowledge a report within 2 business days and send an initial assessment
within 5 business days. We then investigate the affected versions and
coordinate disclosure with the reporter. Keep the details private until a fixed release
is available. Good-faith reports that follow this policy are welcome.

## Supported versions

Version 1.0.0 has not been tagged or published.

| Version | Security fixes |
| --- | --- |
| 1.x | Latest minor release |

Earlier minor and patch releases are not maintained separately. Release notes
are in [CHANGELOG.md](CHANGELOG.md).

## Dependencies

The SDK has no third-party runtime dependencies. Gradle locks the build and test
dependencies in `gradle.lockfile`, and CI scans them with OSV-Scanner on every
change and weekly, failing on any known vulnerability. A clean scan reflects the
advisory data available at the time.
