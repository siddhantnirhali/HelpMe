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
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "HelpMe"
include(":app")
include(":network")
include(":core-data")
include(":core-domain")
include(":core-utils")
include(":feature-permission")
include(":feature-main")
include(":feature-call")
include(":feature-message")
include(":core-ui")
