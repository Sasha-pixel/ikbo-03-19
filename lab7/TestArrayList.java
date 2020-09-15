package ru.mirea.lab7;

import java.util.ArrayList;

public class TestArrayList {
    public TestArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Добавим 5 элементов и ыведем их");
        list.add(0, "Германия");
        list.add(1, "Франция");
        list.add(2, "Россия");
        list.add(3, "Казахстан");
        list.add(4, "Иран");
        for (int i = 0;i < list.size();i++)
            System.out.println(list.get(i));
        System.out.println("--------------------------------------------------");
        System.out.println("Удалим элемент Германия и выведем оставшиеся");
        list.remove("Германия");
        for (int i = 0;i < list.size();i++)
            System.out.println(list.get(i));
        System.out.println("--------------------------------------------------");
        System.out.println("Изменим первый элемент и выведем список");
        list.set(0, "Норвегия");
        for (int i = 0;i < list.size();i++)
            System.out.println(list.get(i));
        System.out.println("--------------------------------------------------");
        System.out.println("Проверим, есть ли в списке элемент <<Франция>>");
        if (list.contains("Франция"))
            System.out.println("В списке есть такой элемент");
        else
            System.out.println("В списке нет такого элемента");
        System.out.println("--------------------------------------------------");
        System.out.println("Теперь создадим новый список, и добавим в него старый, после чего выведем");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add(0, "Лопата");
        list2.add(1, "Грабли");
        list2.add(2, "Коса");
        list2.add(3, "Топор");
        list2.add(4, "Пила");
        list2.addAll(list);
        for (int i = 0;i < list2.size();i++)
            System.out.println(list2.get(i));
    }

    public static void main(String[] args) {
        new TestArrayList();
    }
}
