# JOpenCage

[![Maven Central](https://img.shields.io/maven-central/v/com.opencagedata/jopencage.svg?label=Maven%20Central)](https://central.sonatype.com/artifact/com.opencagedata/jopencage)
[![Java workflow](https://github.com/OpenCageData/jopencage/actions/workflows/java.yml/badge.svg)](https://github.com/OpenCageData/jopencage/actions/workflows/java.yml)
[![Javadoc](https://img.shields.io/badge/JavaDoc-Online-green)](https://opencagedata.github.io/jopencage/javadoc/)

[![security status](https://www.meterian.io/badge/gh/OpenCageData/jopencage/security?branch=master)](https://www.meterian.io/report/gh/OpenCageData/jopencage)
[![stability status](https://www.meterian.io/badge/gh/OpenCageData/jopencage/stability?branch=master)](https://www.meterian.io/report/gh/OpenCageData/jopencage)

This package provides a Java client to the OpenCage Geocoding API: https://opencagedata.com/api

:warning: This is an unstable branch that only contains SNAPSHOT versions; it is still under development.
The latest stable version is 2.2.2 available on MavenCentral and this [branch](https://github.com/OpenCageData/jopencage/tree/2.x)

## Tutorial

You can find a comprehensive tutorial for using this package [on the OpenCage site](https://opencagedata.com/tutorials/geocode-in-java).

## Getting started

Sign up for a [free-trial API Key](https://opencagedata.com/users/sign_up).

## Usage

**Maven**

```xml
  <dependency>
    <groupId>com.opencagedata</groupId>
    <artifactId>jopencage</artifactId>
    <version>replace.with.version</version>
  </dependency>
```

**Gradle**

```gradle
    implementation "com.opencagedata:jopencage:REPLACE.WITH.VERSION"
```

### Examples

#### Forward

```java
// In real-life application, the JOpenCageGeocoder should be a Singleton
JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(YOUR_API_KEY);

JOpenCageForwardRequest request = new JOpenCageForwardRequest("Graz");
request.setMinConfidence(1);
request.setNoAnnotations(false);
request.setNoDedupe(true);
JOpenCageResponse response = jOpenCageGeocoder.forward(request); // try..catch or throw JOpenCageException
```

#### Reverse

```java
// In real-life application, the JOpenCageGeocoder should be a Singleton
JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(YOUR_API_KEY);

JOpenCageReverseRequest request = new JOpenCageReverseRequest(-22.6792, 14.5272);
request.setNoAnnotations(true);

JOpenCageResponse response = jOpenCageGeocoder.reverse(request);  // try..catch or throw JOpenCageException
```

## Upgrading from 1.x or 2.x to 3.x

Starting with version 3.x, the methods `forward()` and `reverse()` can throw a `com.opencagedata.jopencage.JOpenCageException`.

## Javadoc

https://opencagedata.github.io/jopencage/javadoc/

## Libraries

-   JDK 17+
-   Apache Http Client
-   FasterXml Jackson
-   Slf4j

## Testing

For running the tests, you have to use your _OWN_ OpenCage Geocoding API Key. Get a free trial key at https://opencagedata.com

```bash
./gradlew -DOPENCAGE_API_KEY=<your apikey> test
```

## Gradle

```bash
./gradlew wrapper --gradle-version 9.3.1
```

## Contribute

See [Contribution Guidelines](https://github.com/OpenCageData/jopencage/blob/master/.github/CONTRIBUTING.md).

## Changelog

See [CHANGELOG](https://github.com/OpenCageData/jopencage/blob/master/CHANGELOG.md).

## License

Apache 2.0. Please see [LICENSE](jopencage/blob/master/LICENSE).

## History

Until July 2023, this library was maintained by [Michael Oberwasserlechner](https://github.com/moberwasserlechner). At his request, due to a lack of time to work on it, the library was then taken over by OpenCage GmbH. Thanks, Michael!

## Who is OpenCage GmbH?

[![OpenCage Logo](/resources/opencage_logo_300_150.png)](https://opencagedata.com)

We run the [OpenCage Geocoding API](https://opencagedata.com/api). Learn more [about us](https://opencagedata.com/about).

We also run [Geomob](https://thegeomob.com), a series of regular meetups for location based service creators, where we do our best to highlight geoinnovation. If you like geo stuff, you will probably enjoy [the Geomob podcast](https://thegeomob.com/podcast/).


