plugins {
    id("jun.android.library")
    id("jun.android.hilt")
    id("jun.kotlin.hilt")
    id("org.jetbrains.kotlin.android")
    id("kotlinx-serialization")
}

android {
    namespace = "com.jun.data"
}
dependencies {
    implementation(projects.core.model)
    implementation(projects.core.database)
    implementation(projects.core.datastore)

    implementation(libs.androidx.datastore)
    implementation(libs.kotlinx.serialization.json)
}
