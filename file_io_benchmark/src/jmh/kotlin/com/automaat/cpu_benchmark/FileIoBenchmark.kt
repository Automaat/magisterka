package com.automaat.cpu_benchmark

import IoCopy
import org.openjdk.jmh.annotations.Benchmark
import java.io.File

open class FileIoBenchmark {

    @Benchmark
    fun copyFile(): Long {
        val srcFile = File("/opt/app/test_files/input")
        val targetFile = File("/opt/app/test_files/output")
        return IoCopy.copyFile(srcFile, targetFile)
    }
}