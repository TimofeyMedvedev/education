package com.company.javarush.uroven16.excesize.factory;
import com.company.javarush.uroven16.excesize.factory.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes t) {
        if(t == ImageTypes.JPG)
            return new JpgReader();
        else if(t == ImageTypes.PNG)
            return new PngReader();
        else if(t == ImageTypes.BMP)
            return new BmpReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
