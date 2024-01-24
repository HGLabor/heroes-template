val kotlinVersion = "1.8.22"

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    fun pluginDep(id: String, version: String) = "${id}:${id}.gradle.plugin:${version}"

    implementation(kotlin("gradle-plugin", kotlinVersion))
    implementation(kotlin("serialization", kotlinVersion))

    implementation(pluginDep("fabric-loom", "1.2-SNAPSHOT"))
    implementation(pluginDep("xyz.jpenilla.run-velocity", "2.0.1"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
}
