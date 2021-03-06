import org.jetbrains.intellij.tasks.RunIdeTask

plugins {
  application
  kotlin("jvm") version "1.3.21"
  id("org.jetbrains.intellij") version "0.4.5"
}

application {
  mainClassName = "HelloCryptoKt"
}

tasks.withType<RunIdeTask> {
  args = listOf(projectDir.absolutePath)
}

intellij {
  downloadSources = false
}

repositories {
  mavenCentral()
}

dependencies {
  compile("org.eclipse.collections:eclipse-collections-api:9.2.0")
  compile("org.eclipse.collections:eclipse-collections:9.2.0")
  compile(kotlin("stdlib"))
}