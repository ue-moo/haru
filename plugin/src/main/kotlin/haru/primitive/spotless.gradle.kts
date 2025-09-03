package haru.primitive

import com.diffplug.gradle.spotless.SpotlessExtension
import haru.libs
import haru.version

plugins {
    id("com.diffplug.spotless")
}

configure<SpotlessExtension> {
    kotlin {
        target("src/**/*.kt")
        ktlint(libs.version("ktlint"))
    }
}
