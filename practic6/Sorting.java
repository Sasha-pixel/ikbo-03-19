package ru.mirea.practic6;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        Student[] array = new Student[6];
        for (int i = 0;i < 6;i++) {
            array[i] = new Student((int)(2 + Math.random() * 4));
        }
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort (Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
}
