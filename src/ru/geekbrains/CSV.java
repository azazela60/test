package ru.geekbrains;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class CSV {
    public static void main(String[]args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("test.csv");

        String sb = "1" +
                ';' +
                "Andrey" +
                ';' +
                "programmer" +
                ';' +
                "3000 USD" +
                '\n' +
                "2" +
                ';' +
                "Ivan" +
                ';' +
                "tester" +
                ';' +
                "2000 USD" +
                '\n';
        pw.write(sb);
        pw.close();
        System.out.println("done!");
    }
}
