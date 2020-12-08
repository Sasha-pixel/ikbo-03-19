package ru.mirea.practic12;

public class Phone {
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.change();
    }

    private void change() {
        String code = "";
        String number = "";
        char[] chars = this.phoneNumber.toCharArray();
        int i;
        for(i = chars.length - 10; i < chars.length; ++i) {
            number = number + chars[i];
        }
        for(i = 0; i < chars.length - 10; ++i) {
            code = code + chars[i];
        }
        this.phoneNumber = code + " " + number.substring(0, 3) + '-' + number.substring(3, 6) + '-' + number.substring(6, 10);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
