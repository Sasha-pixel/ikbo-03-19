package ru.mirea.lab10;

import java.util.Arrays;
import java.util.ArrayList;

class ArrayToList {
    Object[] array;

    public ArrayToList() {
        array = new Object[5];
        array[0] = "alpha";
        array[1] = 34;
        array[2] = 4.5;
        array[3] = 'V';
        array[4] = 123;
    }

    public void setElement(int index, Object value) {
        array[index] = value;
    }

    public Object getElement(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return "ArrayToList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public ArrayList toArraList(Object[] array) {
        return new ArrayList<Object>(Arrays.asList(array));
    }

    public void printArrayList() {
        ArrayList<Object> list = toArraList(array);
        System.out.print(list.toString());
    }

    public static void main(String[] args) {
        ArrayToList obj = new ArrayToList();
        System.out.println(obj);
        System.out.print("Преобразуем массив array в ArrayList: ");
        obj.printArrayList();
    }
}
