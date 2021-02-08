package com.company.javarush.uroven20;

/*
Переопределение сериализации в потоке
*/

import java.io.*;

public class Solution6 implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution6(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution6 sol = new Solution6("fest.txt");
        sol.writeObject("Hello, I`m Jerry Frank");
        sol.close();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.txt"));
        oos.writeObject(sol);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("save.txt"));
        Solution6 load = (Solution6) ois.readObject();
        ois.close();

        load.writeObject("Qwerty my Peter Parker");
        load.close();
    }
}
