plugins {
    kotlin("jvm")
    id("fabric-loom")
}

val minecraftVersion = "1.20.1"

dependencies {
    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings("net.fabricmc:yarn:$minecraftVersion+build.2:v2")
    modImplementation("net.fabricmc:fabric-loader:0.14.21")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.83.1+$minecraftVersion")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.9.5+kotlin.1.8.22")

    implementAndInclude("me.obsilabor:alert:1.0.8")
}

fun DependencyHandlerScope.implementAndInclude(notation: String) {
    include(notation)
    implementation(notation)
}
