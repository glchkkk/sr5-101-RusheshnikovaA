plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

}

android {
    namespace = "com.example.rusheshnikova22101"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.rusheshnikova22101"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.support.annotations)
    implementation(libs.androidx.gridlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
// Retrofit - библиотека для работы с REST API
    implementation(libs.retrofit)
    implementation(libs.converter.gson) // для конвертации JSON в объекты

    // Room - библиотека для работы с локальной базой данных SQLite
    implementation(libs.androidx.room.runtime) // основная библиотека

    // AChartEngine - библиотека для построения графиков и диаграмм
    implementation(libs.achartengine)

    // Picasso - библиотека для загрузки и кэширования изображений
    implementation(libs.picasso)

    implementation(libs.androidx.room.runtime.v250)

    implementation(libs.androidx.room.ktx) // Поддержка корутин
    implementation(libs.material) // Поддержка Material Design

    implementation(libs.input)
    implementation(libs.drawable.preview)
}



