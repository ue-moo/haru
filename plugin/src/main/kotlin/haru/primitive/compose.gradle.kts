package haru.primitive

import haru.android
import haru.androidTestImplementation
import haru.androidTestImplementationPlatform
import haru.composeCompiler
import haru.debugImplementation
import haru.implementation
import haru.implementationPlatform
import haru.library
import haru.libs

plugins {
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    buildFeatures.compose = true
}

// https://kotlinlang.org/docs/compose-compiler-options.html
composeCompiler {
}

dependencies {
    implementation(libs.library("activityCompose"))
    implementationPlatform(libs.library("composeBom"))
    implementation(libs.library("composeUi"))
    implementation(libs.library("composeUiGraphics"))
    implementation(libs.library("composeUiToolingPreview"))
    implementation(libs.library("composeMaterial3"))
    androidTestImplementationPlatform(libs.library("composeBom"))
    androidTestImplementation(libs.library("composeUiTestJunit4"))
    debugImplementation(libs.library("composeUiTooling"))
    debugImplementation(libs.library("composeUiTestManifest"))
}
