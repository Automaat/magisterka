import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


object IoCopy {
    fun copyFile(srcFile: File, targetFile: File): Long {
        var bytesCopied: Long = 0

        FileInputStream(srcFile)
            .channel
            .use { inputChannel ->
                FileOutputStream(targetFile)
                    .channel
                    .use { outputChannel ->
                        bytesCopied = inputChannel.size()
                        inputChannel.transferTo(0, bytesCopied, outputChannel)
                    }
            }

        return bytesCopied
    }
}
