package com.company.javarush.uroven22.nullObjectPATTERN;

public interface FileData {
    boolean isHidden();

    boolean isExecutable();

    boolean isDirectory();

    boolean isWritable();
}