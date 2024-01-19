# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [2.2.1] - 2024-01-19

- updates dependencies httpClient 5.3, jackson 2.16.1
- updates gradle to 8.5

## [2.2.0] - 2023-11-15

### Changed

- uses HTTPS by default
- adds a User-Agent Header on the API Requests
- updates gradle to 8.4
- updates dependencies jackson 2.15.3, junit 5.10.1

## [2.1.0] - 2023-11-10

### Changed

- adds new request parameters: `roadinfo`, `address_only`, `add_request`

## [2.0.0] - 2023-10-10

### Important

- OpenCage Data is now maintaining this package

## [1.4.1] - 2023-10-04

### Changed

- on maven central the groupId is now `com.opencagedata`, hence the imports are now using `com.opencagedata`
- upgrade gradle to 8.2.1
- updeates dependencies httpClient 5.2.1, jackson 2.15.2, junit 5.10.0
- CI on OpencageData repository

### Fixed

- [@moberwasserlechner](https://github.com/moberwasserlechner): Decimal numbers with large scale are converted to String using the E notation, leading to incorrect results with reverse geocoding.
- [@moberwasserlechner](https://github.com/moberwasserlechner): Coerce latitude/longitude to String preventing E notation [#44](https://github.com/moberwasserlechner/jopencage/issues/44) thx [@lpellegr](https://github.com/lpellegr)
- [@moberwasserlechner](https://github.com/moberwasserlechner): Fixed SSL and AllowAllHostNameVerifier [#43](https://github.com/moberwasserlechner/jopencage/pull/43) thx [@damade](https://github.com/damade)

## [1.4.0] - 2021-04-18

### Important

- JCenter is shutting down! Lib was migrated to MavenCentral (#40)

### Added

- Hold unmapped component fields in a `java.util.Map` (#38) thx [@Dexilon](https://github.com/Dexilon)
- Add FIPS mapping (#35)

### Chore

- Move CI to GH Actions (#39)
- Use JUnit 5 (#39)
- Add GH issue templates (#39)
- Upgrade Gradle to 6.8.3 (#39)
- Fix SLF4J Binder in Tests (#36)

## [1.3.0] - 2019-12-11

### Added

- CHANGELOG file to keep track of changes directly in the repo
- Additional fields for components. Like `continent`, `region`, `village`,... (#33, #34)
- Add support for the `proximity` optional search feature (#31)

### Changed

- Upgrade to Gradle 6

### Fixed

- Fix travis CI config

## [1.2.1] - 2019-02-23

### Added

- Additional tests (#26)

### Changed

- Upgrade Gradle

### Fixed

- Bug fix bounds on forward request (#27)

[Unreleased]: https://github.com/OpenCageData/jopencage/compare/v2.2.1...master
[2.2.1]: https://github.com/OpenCageData/jopencage/compare/v2.2.0...v2.2.1
[2.2.0]: https://github.com/OpenCageData/jopencage/compare/v2.1.0...v2.2.0
[2.1.0]: https://github.com/OpenCageData/jopencage/compare/v2.0.0...v2.1.0
[2.0.0]: https://github.com/OpenCageData/jopencage/compare/v1.4.1...v2.0.0
[1.4.1]: https://github.com/OpenCageData/jopencage/compare/1.4.0...v1.4.1
[1.4.0]: https://github.com/OpenCageData/jopencage/compare/1.3.0...1.4.0
[1.3.0]: https://github.com/OpenCageData/jopencage/compare/1.2.1...1.3.0
[1.2.1]: https://github.com/OpenCageData/jopencage/releases/tag/1.2.1
