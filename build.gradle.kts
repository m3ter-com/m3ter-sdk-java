plugins {
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id("maven-publish")
}

allprojects {
    group = "com.m3ter.sdk"
    version = "0.1.0-alpha.3" // x-release-please-version
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))

            username.set(System.getenv("SONATYPE_USERNAME"))
            password.set(System.getenv("SONATYPE_PASSWORD"))
        }
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}
