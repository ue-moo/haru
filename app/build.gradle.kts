import haru.debugLog
import haru.implementation

plugins {
    alias(libs.plugins.haruPrimitiveApplication)
    alias(libs.plugins.haruPrimitiveCompose)
    alias(libs.plugins.haruPrimitiveSpotless)
}

android {
    defaultConfig {
        versionCode = 1
        versionName = "1.0.0"
        debugLog(
            "applicationId=$applicationId",
            "versionCode=$versionCode",
            "versionName=$versionName",
            "buildConfig=${buildFeatures.buildConfig}",
            "compose=${buildFeatures.compose}",
        )
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.domain)
    implementation(projects.core.ui)
    implementation(libs.coreKtx)
    implementation(libs.lifecycleRuntimeKtx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidJunit)
    androidTestImplementation(libs.espressoCore)
}

