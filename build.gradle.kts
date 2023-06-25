plugins {
    kotlin("jvm") version "1.8.21"
    application
    id("com.google.devtools.ksp") version "1.8.21-1.0.11"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.arrow-kt:arrow-optics:1.2.0-RC")
    ksp("io.arrow-kt:arrow-optics-ksp-plugin:1.2.0-RC")
}

tasks.compileKotlin {
    compilerOptions {
        allWarningsAsErrors.set(true)
    }
}

application {
    mainClass.set("MainKt")
}
