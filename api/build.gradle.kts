val spotbugsVersion: String by project
val vavrVersion: String by project
val lombokVersion: String by project
val floggerVersion: String by project
val findSecBugsVersion: String by project
plugins {
    java
    id("com.github.spotbugs") version "4.6.0"
}

group = "org.poliamori.crypto"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("gradle.plugin.com.github.spotbugs.snom:spotbugs-gradle-plugin:$spotbugsVersion")
    spotbugsPlugins("com.h3xstream.findsecbugs:findsecbugs-plugin:$findSecBugsVersion")

    implementation("io.vavr:vavr:$vavrVersion")
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
    implementation("com.google.flogger:flogger-system-backend:$floggerVersion")

    testCompileOnly("org.projectlombok:lombok:$lombokVersion")
    testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
}
