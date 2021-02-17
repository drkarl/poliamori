plugins {
    java
    id("com.diffplug.spotless") version "5.10.2"
    id("org.owasp.dependencycheck") version "6.1.1"
}

group = "org.poliamori.crypto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("com.binance.api:binance-api-client:1.0.1")
    implementation("com.bitvavo.api:api:1.0")
    implementation("io.vavr:vavr:1.0.0-alpha-3")
    compileOnly("org.projectlombok:lombok:1.18.18")
    annotationProcessor("org.projectlombok:lombok:1.18.18")
    implementation("com.google.flogger:flogger-system-backend:0.5.1")

    testCompileOnly("org.projectlombok:lombok:1.18.18")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.18")
    testImplementation("junit", "junit", "4.12")
}
