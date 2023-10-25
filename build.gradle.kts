import org.gradle.internal.impldep.com.fasterxml.jackson.core.JsonPointer.compile
import org.gradle.internal.impldep.org.junit.Test

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompileOnly("junit:junit:4.12")
    testCompileOnly("org.hamcrest:hamcrest-junit:2.0.0.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation ("org.hamcrest:hamcrest-all:1.3")
    implementation ("com.opencsv:opencsv:5.1")
    implementation ("com.googlecode.json-simple:json-simple:1.1.1")
    implementation ("com.google.code.gson:gson:2.8.2")

}

tasks.test {
    useJUnitPlatform()
}



