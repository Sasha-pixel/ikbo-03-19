package ru.mirea.lab8;

import java.io.*;

public class TestFile {

    public TestFile() {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Asus\\Desktop\\Java 2-ой семестр\\src\\ru\\mirea\\lab8\\file.txt", true);
            String newStr = "А это новая строка.";
            writer.append('\n');
            for (int i = 0; i < newStr.length();i++)
                writer.append(newStr.charAt(i));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader("C:\\Users\\Asus\\Desktop\\Java 2-ой семестр\\src\\ru\\mirea\\lab8\\file.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TestFile();
    }
}
