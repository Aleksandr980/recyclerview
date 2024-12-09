// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.52")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.4")
        classpath ("com.android.tools.build:gradle:8.7.2")
    }
}

plugins {
    id ("com.android.application") version ("8.1.1") apply false
    id ("com.android.library") version ("8.1.1") apply false
    id ("org.jetbrains.kotlin.android") version ("1.8.20") apply false
}