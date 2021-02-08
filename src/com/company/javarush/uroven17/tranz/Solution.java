package com.company.javarush.uroven17.tranz;
import java.io.*;
import java.util.*;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String file1 = "";
        String file2 = "";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (IOException e) {}

        try(BufferedReader reader1 = new BufferedReader(new FileReader(file1));
                BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            while (reader1.ready()) {
                allLines.add(reader1.readLine());
            }
            while (reader2.ready()) {
                forRemoveLines.add(reader2.readLine());
            }
            new Solution().joinData();
        } catch (IOException e) {}
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.removeAll(allLines);
            throw new CorruptedDataException();
        }
    }
}