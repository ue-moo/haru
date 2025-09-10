import haru.implementation

plugins {
    alias(libs.plugins.haruPrimitiveAndroid)
    alias(libs.plugins.haruPrimitiveSpotless)
}

dependencies {
    implementation(projects.core.domain)
    implementation(libs.coreKtx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidJunit)
    androidTestImplementation(libs.espressoCore)
}
