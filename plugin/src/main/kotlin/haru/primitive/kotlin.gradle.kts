package haru.primitive

import haru.debugLog
import haru.libs
import haru.version

plugins {
    id("org.jetbrains.kotlin.jvm")
}

kotlin {
    val jdk = libs.version("jdk").toInt()
    jvmToolchain(jdk)
    debugLog("jdk=$jdk")
}
