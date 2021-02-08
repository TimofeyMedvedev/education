package com.company.javarush.uroven22;

import java.io.*;
import java.util.Arrays;
import java.util.Vector;
import java.util.zip.ZipInputStream;

public class UnzipFile {
    public static void main(String[] args) {
        Vector<FileInputStream> files = new Vector<>();
        Arrays.sort(args, 1, args.length);

        try {
            for(int i = 1; i < args.length; i++) {
                files.addElement(new FileInputStream(args[i]));
            }
        } catch (FileNotFoundException exc) {}

        try (ZipInputStream zip = new ZipInputStream(new SequenceInputStream(files.elements()));
             FileOutputStream fos = new FileOutputStream(args[0])) {
            byte[] buffer = new byte[1024*1024];
            int len;
            while (zip.getNextEntry() != null) {
                while ((len = zip.read(buffer, 0, buffer.length)) > 0)
                    fos.write(buffer, 0, len);
                zip.closeEntry();
            }
        } catch (IOException exc) {}
    }
}
