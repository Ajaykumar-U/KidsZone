
object Versions {
    val compileSdk_version = 34
    val minSdk_version = 29
    val targetSdk_version = 34
    val versionCode = 1
    val versionName = "1.0"
    val jvmTarget_version = "1.8"

    val ktx_version = "1.7.0"
    val appcompat_version = "1.6.1"
    val google_material_version = "1.9.0"
    val constraintlayout_version = "2.1.4"
    val junit_version = "4.13.2"
    val test_junit_version = "1.1.5"
    val test_espresso_version = "3.5.1"
    val lottie_version = "6.1.0"
}

object Deps {
    val ktx_stdlib = "androidx.core:core-ktx:${Versions.ktx_version}"
    val appcompat_stdlib = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    val google_material_stdlib = "com.google.android.material:material:${Versions.google_material_version}"
    val constraintlayout_stdlib = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout_version}"
    val junit_stdlib = "junit:junit:${Versions.junit_version}"
    val test_junit_stdlib = "androidx.test.ext:junit:${Versions.test_junit_version}"
    val test_espresso_stdlib = "androidx.test.espresso:espresso-core:${Versions.test_espresso_version}"
    val lottie_stdlib = "com.airbnb.android:lottie:${Versions.lottie_version}"
}