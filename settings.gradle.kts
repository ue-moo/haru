pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Haru"

include(":app")
includeAllUnder(path = "core", prefix = ":core:")
includeAllUnder(path = "feature", prefix = ":feature:")

// include all modules under path
private fun includeAllUnder(path: String, prefix: String = "") {
    val dir = file(path)
    if (!dir.exists() || !dir.isDirectory) {
        logger.error("⚙️[gradle] ${dir.name} does NOT exist or is not dirctory")
        return
    }
    dir.listFiles { file -> file.isDirectory && File(file, "build.gradle.kts").exists() }
        ?.apply {
            if (isEmpty()) {
                logger.error("⚙️[gradle] No modules found under ${dir.name} directory")
            }
        }
        ?.forEachIndexed { index, module ->
            val moduleName = "$prefix${module.name}"
            logger.lifecycle("⚙️[gradle] ($index) include $moduleName")
            include(moduleName)
        }
}
