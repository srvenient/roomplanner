plugins {
    java
}

subprojects {
    apply(plugin = "java-library")

    configure<JavaPluginExtension> {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

    repositories {
        mavenLocal()
        mavenCentral()
    }

    tasks {
        compileJava {
            options.compilerArgs.add("-parameters")
        }
    }
}