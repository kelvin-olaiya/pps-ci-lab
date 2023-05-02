plugins {
    java
    scala
    application
}

application {
    mainClass.set("Application")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.11.12")
}