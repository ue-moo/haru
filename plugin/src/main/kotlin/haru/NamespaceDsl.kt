package haru

import org.gradle.api.Project


internal val Project.defaultPackageName: String
    get() {
        val moduleName = project.path.removePrefix(":").replace(":", ".")
        return "com.github.uemoo.haru.$moduleName"
    }
