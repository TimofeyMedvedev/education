package com.company.javarush.uroven22;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class AddFileToArchive {
    public static void main(String[] args) {
        Map<String, ByteArrayOutputStream> map = new HashMap<>();
        boolean isFile = false;
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(args[1]))) {
            ZipEntry zipEntry;
            while ((zipEntry = zip.getNextEntry()) != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] b = new byte[1024 * 1024];
                int len;
                while ((len = zip.read(b)) > 0) {
                    baos.write(b, 0, len);
                }
                map.put(zipEntry.getName(), baos);
                zip.closeEntry();
                baos.close();
            }
        } catch (IOException exc) {}

        try (ZipOutputStream zop = new ZipOutputStream(new FileOutputStream(args[1]))) {
            String fileName = args[0].substring(args[0].lastIndexOf("\\") + 1);
            Path newFile = Paths.get(args[0]);

            for(Map.Entry<String, ByteArrayOutputStream> pair : map.entrySet()) {
                if(fileName.equals(pair.getKey().substring(pair.getKey().lastIndexOf("\\") + 1))) {
                    isFile = true;
                    continue;
                }
                zop.putNextEntry(new ZipEntry(pair.getKey()));
                zop.write(pair.getValue().toByteArray());
                zop.closeEntry();
            }

            ZipEntry entry;
            if(isFile) {
                entry = new ZipEntry(fileName);
                zop.putNextEntry(entry);
                Files.copy(Paths.get(args[0]), zop);
                zop.closeEntry();
            }
            else {
                entry = new ZipEntry("new/" + fileName);
                zop.putNextEntry(entry);
                Files.copy(newFile, zop);
                zop.closeEntry();
            }
        } catch (IOException exc) {}
    }
}
