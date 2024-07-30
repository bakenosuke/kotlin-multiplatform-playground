plugins {
    kotlin("multiplatform") version "1.9.10"
}

group = "bakenosuke"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    js {
        binaries.executable()
        browser()
        nodejs()
        generateTypeScriptDefinitions()
    }
    sourceSets {
        val jsMain by getting
    }
}