package haru.primitive

import haru.debugLog
import haru.defaultPackageName
import haru.libs
import haru.version

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
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
