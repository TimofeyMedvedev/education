package com.company;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDem02
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.err.println("Способ применения: java ExtCmnt infile outfile");
            return;
        }

        Pattern p;
        try
        {
            // Следующий шаблон определяет многострочные комментарии,
            // располагающиеся в одной строке (например, /* одна строка */)
            // и однострочные комментарии (например, // какая-то строка).
            // Комментарий может располагаться в любом месте строки.

            p = Pattern.compile(".*/\\*.*\\*/|.*//.*$");
        }
        catch (PatternSyntaxException pse)
        {
            System.err.printf("Синтаксическая ошибка в регулярном выражении: %s%n", pse.getMessage());
            System.err.printf("Описание ошибки: %s%n", pse.getDescription());
            System.err.printf("Позиция ошибки: %s%n", pse.getIndex());
            System.err.printf("Ошибочный шаблон: %s%n", pse.getPattern());
            return;
        }

        try (FileReader fr = new FileReader(args[0]);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(args[1]);
             BufferedWriter bw = new BufferedWriter(fw))
        {
            Matcher m = p.matcher("");
            String line;
            while ((line = br.readLine()) != null)
            {
                m.reset(line);
                if (m.matches()) /* Должна соответствовать вся строка */
                {
                    bw.write(line);
                    bw.newLine();
                }
            }
        }
        catch (IOException ioe)
        {
            System.err.println(ioe.getMessage());
            return;
        }
    }
}