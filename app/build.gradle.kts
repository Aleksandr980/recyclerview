plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
    id ("androidx.navigation.safeargs")
    id ("kotlin-parcelize")
}

android {
    namespace = "com.example.m17_recyclerview"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.m17_recyclerview"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}
dependencies {
    implementation ("androidx.core:core-ktx:1.15.0")
    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation ("com.google.android.material:material:1.12.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation ("androidx.fragment:fragment-ktx:1.8.5")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.8.4")
    implementation ("androidx.navigation:navigation-ui-ktx:2.8.4")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.11.0")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    kapt ("com.github.bumptech.glide:compiler:4.16.0")
    implementation ("com.google.dagger:hilt-android:2.52")
    kapt ("com.google.dagger:hilt-compiler:2.52")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.paging:paging-runtime-ktx:3.3.4")
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.2.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.1")
}