package ru.mirea.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLine {
    private Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
    private Matcher matcher;

    public CheckLine(String line) {
        this.matcher = this.pattern.matcher(line);
    }

    public boolean isLine() {
        return this.matcher.matches();
    }

    public static void main(String[] args) {
        CheckLine checkLine = new CheckLine("abcdefghijklmnopqrstuv18340");
        System.out.println(checkLine.isLine());
    }
}
