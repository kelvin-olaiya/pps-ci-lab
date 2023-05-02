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
    implementation("org.scala-lang:scala3-library_3:3.3.1-RC1-bin-20230215-006e2e4-NIGHTLY")
}
