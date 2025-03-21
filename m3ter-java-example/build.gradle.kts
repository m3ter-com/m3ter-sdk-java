plugins {
    id("m3ter.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":m3ter-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.m3ter.sdk.example.Main"
}
