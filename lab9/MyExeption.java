package ru.mirea.lab9;

import java.util.Scanner;

public class MyExeption {

    public void exceptionDemo1() {
        try {
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public void exceptionDemo2() {
        try {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.Try again!");
        }
        finally {
            System.err.println(" =( ");
        }
    }

    public static void main(String[] args) {
        MyExeption exeption = new MyExeption();
        exeption.exceptionDemo1();
        exeption.exceptionDemo2();
    }
}
