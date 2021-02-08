package com.company.javarush.uroven16.excesize.factory;
import com.company.javarush.uroven16.excesize.factory.common.ImageReader;
import com.company.javarush.uroven16.excesize.factory.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
        System.out.println(reader);
        reader = ImageReaderFactory.getImageReader(ImageTypes.PNG);
        System.out.println(reader);
        reader = ImageReaderFactory.getImageReader(null);
        System.out.println(reader);
    }
}
