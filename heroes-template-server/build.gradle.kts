import java.text.SimpleDateFormat
import java.util.*

plugins {
    fabric
    kotlin
    silk
}

version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.wispforest.io")
    include(implementation(project(":heroes-template-common", configuration = "namedElements"))!!)
}

dependencies {
}

tasks {
    processResources {
        val properties = mapOf(
            "version" to project.version,
            "buildDate" to SimpleDateFormat("yyyyMMdd").format(Date())
        )
        inputs.properties(properties)
        filesMatching("fabric.mod.json") {
            expand(properties)
        }
    }
}


