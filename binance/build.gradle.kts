val spotbugsVersion: String by project
val vavrVersion: String by project
val lombokVersion: String by project
val floggerVersion: String by project
val binanceApiVersion: String by project
val findSecBugsVersion: String by project
val springBootVersion: String by project
plugins {
    java
    id("com.github.spotbugs") version "4.6.0"
    id("com.diffplug.spotless") version "5.10.2"
    id("org.owasp.dependencycheck") version "6.1.1"
}

group = "org.poliamori.crypto"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":api"))
    implementation("gradle.plugin.com.github.spotbugs.snom:spotbugs-gradle-plugin:$spotbugsVersion")
    implementation("com.binance.api:binance-api-client:$binanceApiVersion")
    spotbugsPlugins("com.h3xstream.findsecbugs:findsecbugs-plugin:$findSecBugsVersion")

    implementation("io.vavr:vavr:$vavrVersion")
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
    implementation("com.google.flogger:flogger-system-backend:$floggerVersion")
    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
    compileOnly("org.springframework.boot:spring-boot-devtools:$springBootVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    testCompileOnly("org.projectlombok:lombok:$lombokVersion")
    testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
}
