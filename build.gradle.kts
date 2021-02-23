plugins {
    kotlin("multiplatform") version "1.4.30"
}

group = "me.raspinall"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.apply {
        compilations.getByName("main") {
            val myInterop by cinterops.creating {
                defFile(project.file("src/nativeInterop/cinterop/libcurl.def"))
                packageName("me.raspinall.http")
                compilerOpts("-I/")
                includeDirs.apply { allHeaders("path") }
            }
        }
    }

    nativeTarget.apply {

        binaries {
            executable {
                entryPoint = "me.raspinall.http.main"
            }
        }
    }


    sourceSets {
        val nativeMain by getting
        val nativeTest by getting
    }
}