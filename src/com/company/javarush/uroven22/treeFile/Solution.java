package com.company.javarush.uroven22.treeFile;

/*
Проход по дереву файлов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + File.separator + "/allFilesContent.txt");
        if(FileUtils.isExist(resultFileAbsolutePath))
            FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        Map<String, File> list = new TreeMap<>();
        File path = new File(args[0]);
        fileSearch(path, list);

        try (FileOutputStream fos = new FileOutputStream(allFilesContent, true)) {
            for(Map.Entry<String, File> pair : list.entrySet()) {
                try (FileInputStream fis = new FileInputStream(pair.getValue())) {
                    while (fis.available() > 0) {
                        fos.write(fis.read());
                    }
                    fos.write("\\n".getBytes());
                } catch (FileNotFoundException exc) {
                }
            }
        } catch (IOException exc) {
        }
    }

    public static void fileSearch(File path, Map<String, File> list) {
        for(File f : path.listFiles()) {
            if(f.isFile()) {
                if(f.length() <= 50)
                    list.put(f.getName(), new File(f.getAbsolutePath()));
            }
            else if(f.isDirectory())
                fileSearch(f, list);
        }
    }
}
