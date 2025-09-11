package haru

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.initialization.Settings
import org.gradle.api.logging.Logger
import org.gradle.internal.cc.base.logger
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.configure

fun Project.debugLog(vararg param: Any) {
    logger.debugLog(*param)
}

fun Settings.debugLog(vararg param: Any) {
    logger.debugLog(*param)
}

private fun Logger.debugLog(vararg param: Any) {
    val message = buildString {
        append("⚙️[GRADLE]")
        if (param.size != 1) {
            append("\n")
        }
        param.forEachIndexed { index, value ->
            val indent = if (param.size != 1) "    " else ""
            append("$indent ($index) $value")
            if (index != param.lastIndex) {
                append("\n")
            }
        }
    }
    lifecycle(message)
}

fun Project.android(action: BaseExtension.() -> Unit) {
    extensions.configure(action)
}

fun DependencyHandlerScope.ksp(
    artifact: MinimalExternalModuleDependency,
) {
    add("ksp", artifact)
}

fun DependencyHandlerScope.kspTest(
    artifact: MinimalExternalModuleDependency,
) {
    add("kspTest", artifact)
}

fun DependencyHandlerScope.implementation(
    artifact: Dependency,
) {
    add("implementation", artifact)
}

fun DependencyHandlerScope.implementation(
    artifact: MinimalExternalModuleDependency,
) {
    add("implementation", artifact)
}

fun DependencyHandlerScope.debugImplementation(
    artifact: MinimalExternalModuleDependency,
) {
    add("debugImplementation", artifact)
}

fun DependencyHandlerScope.androidTestImplementation(
    artifact: MinimalExternalModuleDependency,
) {
    add("androidTestImplementation", artifact)
}

fun DependencyHandlerScope.testImplementation(
    artifact: MinimalExternalModuleDependency,
) {
    add("testImplementation", artifact)
}

fun DependencyHandlerScope.implementationPlatform(
    artifact: MinimalExternalModuleDependency,
) {
    add("implementation", platform(artifact))
}

fun DependencyHandlerScope.androidTestImplementationPlatform(
    artifact: MinimalExternalModuleDependency,
) {
    add("androidTestImplementation", platform(artifact))
}
