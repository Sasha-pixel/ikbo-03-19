package ru.mirea.lab9;

import java.util.Scanner;

public class TrowExeption {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        for (int i = 0;i < 2;i++) {
            try {
                printDetails(key);
                return;
            } catch (Exception e) {
                System.err.println(" =( ");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        new TrowExeption().getKey();
    }
}
