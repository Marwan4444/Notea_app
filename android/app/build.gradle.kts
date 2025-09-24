plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.note_app"
    compileSdk = 33 // أو flutter.compileSdkVersion إذا شغال معك
    ndkVersion = "27.0.12077973" // ✅ فقط هذا السطر يكفي، لا تكرره

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.note_app"
        minSdk = 23 // ✅ هذا هو السطر الصحيح
        targetSdk = 33 // أو flutter.targetSdkVersion لو تشتغل به
        versionCode = 1 // أو flutter.versionCode
        versionName = "1.0" // أو flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
