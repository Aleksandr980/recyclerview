pluginManagement {
    repositories {
        google()
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
rootProject.name = "m17_recyclerview"
include(":app")


//plugins {
//    kotlin("jvm") version "1.8.0" // Убедитесь, что вы используете последнюю версию плагина
//}
//
//repositories {
//    mavenCentral() // Используйте стабильные репозитории
//    jcenter() // Если это все еще актуально для вашего проекта
//}
//
//// Вместо @Incubating использования RepositoriesMode
//dependencies {
//    implementation(kotlin("stdlib"))
//}