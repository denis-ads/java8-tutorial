package org.java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.StandardCopyOption;

public class FilesCopy {
    public static void main(String[] args) {
        try {
            // Exemplo 1
            InputStream initialStream = new FileInputStream(new File("src/main/resources/sample.txt"));
            File targetFile = new File("src/main/resources/targetFile.tmp");

            java.nio.file.Files.copy(initialStream, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

            // Exemplo 2
            InputStream initialStream1 = new FileInputStream(new File("src/main/resources/sample.txt"));
            byte[] buffer = new byte[initialStream1.available()];
            initialStream.read(buffer);

            File targetFile1 = new File("src/main/resources/targetFile.tmp");
            OutputStream outStream = new FileOutputStream(targetFile1);
            outStream.write(buffer);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
