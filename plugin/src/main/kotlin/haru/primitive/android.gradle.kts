package haru.primitive

import haru.debugLog
import haru.defaultPackageName
import haru.implementation
import haru.ksp
import haru.library
import haru.libs
import haru.version

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
}

kotlin {
    val jdk = libs.version("jdk").toInt()
    jvmToolchain(jdk)
    debugLog("jdk=$jdk")
}

android {
    namespace = defaultPackageName
    compileSdkVersion(libs.version("compileSdk").toInt())

    defaultConfig {
        minSdk = libs.version("minSdk").toInt()
        debugLog(
            "namespace=$namespace",
            "compileSdk=$compileSdk",
            "minSdk=$minSdk",
        )
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(libs.library("daggerHiltAndroid"))
    ksp(libs.library("daggerHiltAndroidCompiler"))
    // testImplementation(libs.library("daggerHiltAndroidTesting"))
    // kspTest(libs.library("daggerHiltAndroidCompiler"))
}
