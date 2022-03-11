plugins {
    kotlin("jvm") version "1.6.20-RC"
    java
    id("com.github.ben-manes.versions") version "0.42.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.pi4j:pi4j-core:2.1.1")
    implementation("com.pi4j:pi4j-plugin-raspberrypi:2.1.1")
    implementation("io.dropwizard:dropwizard-core:2.1.0-beta.7")
    implementation("io.dropwizard:dropwizard-util:2.1.0-beta.7")
    implementation("org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.5")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.1")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.1")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-toml:2.13.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
    implementation("com.fasterxml.jackson.module:jackson-module-parameter-names:2.13.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.13.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
