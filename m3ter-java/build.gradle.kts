plugins {
    id("m3ter.kotlin")
    id("m3ter.publish")
}

dependencies {
    api(project(":m3ter-java-client-okhttp"))
}
