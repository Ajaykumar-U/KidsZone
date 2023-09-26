plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = Versions.compileSdk_version

    defaultConfig {
        applicationId = "com.ajay.kidszone"
        minSdk = Versions.minSdk_version
        targetSdk = Versions.targetSdk_version
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Versions.jvmTarget_version
    }
}

dependencies {

    implementation(Deps.ktx_stdlib)
    implementation(Deps.appcompat_stdlib)
    implementation(Deps.google_material_stdlib)
    implementation(Deps.constraintlayout_stdlib)
    testImplementation(Deps.junit_stdlib)
    androidTestImplementation(Deps.test_junit_stdlib)
    androidTestImplementation(Deps.test_espresso_stdlib)
    implementation(Deps.lottie_stdlib)
}