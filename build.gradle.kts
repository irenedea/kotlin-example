plugins {
    kotlin("jvm") version "1.4.0"

    application
}

// Enable running the main function HelloWorld.kt via `./gradlew run`
application {
    mainClassName = "mypackage.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("test-common"))
    implementation(kotlin("test-annotations-common"))
    implementation(kotlin("test-junit"))
}
