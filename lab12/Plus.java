package ru.mirea.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plus {
    private Pattern pattern = Pattern.compile("[0-9]+ \\+");
    private Matcher matcher;

    public Plus(String line) {
        this.matcher = this.pattern.matcher(line);
    }

    public boolean hasPlus() {
        return this.matcher.find();
    }

    public static void main(String[] args) {
        Plus plus = new Plus("(1 + 8) – 9 / 4");
        System.out.println(plus.hasPlus());
    }
}
