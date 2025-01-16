plugins {
    kotlin("jvm") version "1.9.23"
}

group = "ua.manhumor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(
        url = "https://jitpack.io"
    )
}

dependencies {
    testImplementation(kotlin("test"))
    // implementation("net.dv8tion:JDA:5.2.2")
    implementation("io.github.freya022:JDA:47e8947304")
    implementation("ch.qos.logback:logback-classic:1.5.6")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}