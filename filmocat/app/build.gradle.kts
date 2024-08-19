plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.filmo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    sourceSets {
        getByName("main") {
            assets {
                srcDirs("src/main/assets")
            }
        }
    }

    // Especifica el namespace aquí
    namespace = "com.example.filmo"
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("org.bouncycastle:bcpkix-jdk15on:1.69")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("org.bouncycastle:bcprov-jdk15on:1.69")
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    implementation("androidx.test:runner:1.5.2")
    implementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.itextpdf:itextpdf:5.5.13.2")
    androidTestImplementation("androidx.test.uiautomator:uiautomator:2.2.0")

    // Agrega Mockito para pruebas unitarias
    testImplementation("org.mockito:mockito-core:3.11.2")

    // Agrega la siguiente línea para incluir las pruebas de la carpeta test
    testImplementation("androidx.test.ext:junit:1.1.5")
}