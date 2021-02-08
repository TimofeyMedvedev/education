package com.company.javarush.uroven18;
import java.io.*;

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "test.txt";
    private FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream fos) throws FileNotFoundException {
        super(fileName);
        this.fos = fos;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fos.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("edv".getBytes());
        fos.close();
    }

    @Override
    public void flush() throws IOException {
        fos.flush();
    }
}
