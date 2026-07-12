plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.4"
}

group = "com.dvigo"
version = "1.2.0"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.1.5")
    type.set("IC") 
    updateSinceUntilBuild.set(false)
}

tasks {
    patchPluginXml {
        sinceBuild.set("201")
        untilBuild.set("")
    }
}
