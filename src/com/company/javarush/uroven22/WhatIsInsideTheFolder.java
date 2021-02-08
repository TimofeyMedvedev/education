package com.company.javarush.uroven22;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WhatIsInsideTheFolder extends SimpleFileVisitor<Path> {
    long allSize = 0;
    int allFiles = 0;
    int allFolder = -1;

    public static void main(String[] args) throws IOException {
        Path path;
        String directory = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            directory = reader.readLine();
        } catch (IOException exc) {}

        path = Paths.get(directory);
        if(!Files.isDirectory(path))
            System.out.println(path.toAbsolutePath() + " - не папка");

        else {
            WhatIsInsideTheFolder what = new WhatIsInsideTheFolder();
            Files.walkFileTree(path, what);
            System.out.println("Всего папок - " + what.allFolder);
            System.out.println("Всего файлов - " + what.allFiles);
            System.out.println("Общий размер - " + what.allSize);
        }
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        allFolder++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        allFiles++;
        allSize += Files.size(file);
        return FileVisitResult.CONTINUE;
    }
}
