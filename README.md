# Kotlin/Multiplatform Playground

## Purpose

My purpose is to allow people to play around with how the Kotlin/Multiplatform compiler behaves in various scenarios and what the capabilities, limitations and quirks are in the transpiled code.

## Getting started

### Style Guide

* Package names:
  * Should use the plural name (where applicable)
  * Should be no longer than 3 levels deep
* Class names:
  * Should always end with ```Example.kt```
  * Should always be contained within a package
* Security:
  * No sensitive, private or confidential data should be committed to this repository

### Transpiling

Simply run ```./gradlew build```

You will be able to find the transpiled code in the ```/build/js/packages/kotlin-multiplatform-plaground/kotlin``` directory.

### Adding Libraries and updating build configs

All of this is controlled from within ```/build.gradle.kts```

Kotlin provides a document detailing how to add various capabilities (see: https://kotlinlang.org/docs/js-project-setup.html)

If you are looking to access and use JS libraries from within the Kotlin code, JetBrains offers Kotlin wrappers for popular libraries (see: https://github.com/JetBrains/kotlin-wrappers)

