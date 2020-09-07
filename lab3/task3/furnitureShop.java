package ru.mirea.lab3.task3;
import java.util.Vector;

public class furnitureShop {
    private Vector<Furniture> vector=new Vector<Furniture>();

    public void addObj(Furniture obj) {
        vector.add(obj);
    }

    public void removeObj(Furniture obj) {
        vector.remove(obj);
    }

    public void outElement(Furniture obj) {
        System.out.println(vector.elementAt(vector.indexOf(obj)));
    }

    public void outAllElements() {
        for (int i = 0;i < vector.size();i++)
            System.out.println(vector.elementAt(i));
    }
}
