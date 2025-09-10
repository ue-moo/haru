import haru.implementation

plugins {
    alias(libs.plugins.haruPrimitiveAndroid)
    alias(libs.plugins.haruPrimitiveCompose)
    alias(libs.plugins.haruPrimitiveSpotless)
}

dependencies {
    implementation(projects.core.domain)
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidJunit)
    androidTestImplementation(libs.espressoCore)
}
