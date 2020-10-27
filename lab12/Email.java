package ru.mirea.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    private Matcher matcher;

    public Email(String email) {
        this.matcher = this.pattern.matcher(email);
    }

    public boolean isEmail() {
        return this.matcher.matches();
    }

    public static void main(String[] args) {
        Email email = new Email("al.kanenckoff@yandex.ru");
        System.out.println(email.isEmail());
    }
}
