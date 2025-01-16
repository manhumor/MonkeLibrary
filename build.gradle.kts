plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.serialization") version "2.1.0"
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
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    test {
        useJUnitPlatform()
    }
    withType<Jar> {
        manifest {
            attributes["Main-Class"] = "ua.manhumor.MainKt"
        }
    }
}

kotlin {
    jvmToolchain(21)
}