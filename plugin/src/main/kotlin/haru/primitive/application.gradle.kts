package haru.primitive

import haru.debugLog
import haru.libs
import haru.version

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

kotlin {
    val jdk = libs.version("jdk").toInt()
    jvmToolchain(jdk)
    debugLog("jdk=$jdk")
}

android {
    namespace = "com.github.uemoo.haru"
    compileSdkVersion(libs.version("compileSdk").toInt())

    defaultConfig {
        minSdk = libs.version("minSdk").toInt()
        targetSdk = libs.version("targetSdk").toInt()
        debugLog(
            "namespace=$namespace",
            "compileSdk=$compileSdk",
            "minSdk=$minSdk",
            "targetSdk=$targetSdk",
        )
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures.buildConfig = true
}
