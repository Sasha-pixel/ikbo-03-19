package ru.mirea.practic6;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }

    public void quickSort(Student[] array, int left, int right)
    {
        int l_hold = left;
        int r_hold = right;
        int middle = (left + right) / 2;
        Student pivot = array[middle];

        while (l_hold < r_hold){
            while (compare(array[l_hold], pivot) < 0)
                l_hold++;
            while (compare(array[r_hold], pivot) > 0)
                r_hold--;

            if (l_hold < r_hold)
            {
                Student temp = array[l_hold];
                array[l_hold] = array[r_hold];
                array[r_hold] = temp;
                l_hold++; r_hold--;
            }
        }

        if (left < r_hold)
            quickSort(array, left, r_hold);
        if (right > l_hold)
            quickSort(array, l_hold, right - 1);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA object = new SortingStudentsByGPA();
        Student[] array = new Student[6];
        for (int i = 0;i < 6;i++)
            array[i] = new Student((int)(Math.random() * 101));
        object.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
