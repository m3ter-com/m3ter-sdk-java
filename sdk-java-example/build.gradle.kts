plugins {
    id("m3ter.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":sdk-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :sdk-java-example:run` to run `Main`
    // Use `./gradlew :sdk-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.m3ter.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
