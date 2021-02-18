plugins {
    java
    id("com.github.spotbugs") version "4.6.0"
}

group = "org.poliamori.crypto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    spotbugsPlugins("com.h3xstream.findsecbugs:findsecbugs-plugin:1.10.1")

    implementation("io.vavr:vavr:1.0.0-alpha-3")
    compileOnly("org.projectlombok:lombok:1.18.18")
    annotationProcessor("org.projectlombok:lombok:1.18.18")
    implementation("com.google.flogger:flogger-system-backend:0.5.1")

    testCompileOnly("org.projectlombok:lombok:1.18.18")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.18")
}
