rootProject.name = "heroes-template"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
    }
}

include("heroes-template-common")
include("heroes-template-client")
include("heroes-template-server")

