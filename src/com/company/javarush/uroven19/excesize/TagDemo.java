package com.company.javarush.uroven19.excesize;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class TagDemo {
    public static void main(String[] args) {
        String file = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        } catch (IOException exc) {}

        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                text += reader.readLine();
            }
        } catch (IOException exc) {}

        Document document = Jsoup.parse(text, "UTF-8", Parser.xmlParser());
        Elements tag = document.getElementsByTag(args[0]);
        System.out.println(tag);
    }
}
