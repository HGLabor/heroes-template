plugins {
    kotlin("jvm")
    id("fabric-loom")
}

val silkVersion = "1.10.0"

dependencies {
    include(modImplementation("net.silkmc:silk-commands:$silkVersion")!!)
    include(modImplementation("net.silkmc:silk-core:$silkVersion")!!)
    modImplementation("net.silkmc:silk-igui:$silkVersion")
}