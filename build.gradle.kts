plugins {
    id("org.jetbrains.dokka") version "2.0.0"
    id("maven-publish")
}

repositories {
    mavenCentral()
}

allprojects {
    group = "com.m3ter"
    version = "0.3.0-alpha" // x-release-please-version
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaJavadocCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaJavadocCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "sdk-java" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}

publishing {
    repositories {
        mavenLocal()
    }
}