package com.company.javarush.uroven16.excesize;

import java.io.*;
import java.util.*;

public class Solution4 {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException exc) {}
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private List<String> fileContent = new ArrayList<>();

        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        public String getFileContent() {
            String result = "";
            for(int i = 0; i < fileContent.size(); i++) {
                if(i == fileContent.size() - 1)
                    result += fileContent.get(i);
                else result += fileContent.get(i) + " ";
            }
            return result;
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (true) {
                    String s = reader.readLine();
                    if(s == null)
                        break;
                    fileContent.add(s);
                }
            } catch (IOException e) {}
        }
    }
}