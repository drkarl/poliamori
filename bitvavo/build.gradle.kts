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
    implementation("gradle.plugin.com.github.spotbugs.snom:spotbugs-gradle-plugin:4.6.0")
    implementation("com.bitvavo.api:api:1.0")
    spotbugsPlugins("com.h3xstream.findsecbugs:findsecbugs-plugin:1.10.1")

    implementation("io.vavr:vavr:1.0.0-alpha-3")
    compileOnly("org.projectlombok:lombok:1.18.18")
    annotationProcessor("org.projectlombok:lombok:1.18.18")
    implementation("com.google.flogger:flogger-system-backend:0.5.1")
    implementation("org.springframework.boot:spring-boot-starter:2.4.2")
    compileOnly("org.springframework.boot:spring-boot-devtools:2.4.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.4.2")
    testCompileOnly("org.projectlombok:lombok:1.18.18")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.18")
}
