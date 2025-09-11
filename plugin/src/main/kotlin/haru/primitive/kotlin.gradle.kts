package haru.primitive

import haru.debugLog
import haru.implementation
import haru.ksp
import haru.library
import haru.libs
import haru.version

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.google.devtools.ksp")
}

kotlin {
    val jdk = libs.version("jdk").toInt()
    jvmToolchain(jdk)
    debugLog("jdk=$jdk")
}

dependencies {
    implementation(libs.library("daggerHiltCore"))
    ksp(libs.library("daggerHiltCompiler"))
    // testImplementation(libs.library("daggerHiltTesting"))
    // kspTest(libs.library("daggerHiltCompiler"))
}
