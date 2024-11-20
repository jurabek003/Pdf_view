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
//        maven(url = java.net.URI("https://jcenter.bintray.com"))
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {

        maven { url = uri("https://jitpack.io") }
        google()
        mavenCentral()
        maven(url = java.net.URI("https://jcenter.bintray.com"))
    }
}

rootProject.name = "Saodat asri qissalari 1-qism"
include(":app")
