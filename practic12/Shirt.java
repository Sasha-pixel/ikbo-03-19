package ru.mirea.practic12;

public class Shirt {
    private String[] arr = new String[11];
    private final int SIZE = 11;
    private final String[] VALUES = new String[]{"Code", "Type", "Color", "Size"};

    public void add(String value, int index) {
        this.arr[index] = value;
    }

    public String toString() {
        String result = "";
        for(int i = 0; i < 11; ++i) {
            String[] tokens = this.arr[i].split(",");

            for(int j = 0; j < tokens.length; ++j) {
                result = result + this.VALUES[j] + ":" + tokens[j] + " ";
            }

            result = result + '\n';
        }
        return result;
    }
}
