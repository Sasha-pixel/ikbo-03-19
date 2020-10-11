package ru.mirea.practic8;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10;i++)
            arrayList.add((int)(Math.random() * 100));
        WaitList<Integer> waitList = new WaitList<Integer>(arrayList);
        System.out.println(waitList);

        BoundedWaitList<Character> boundedWaitList = new BoundedWaitList<>(10);
        for (int i = 0;i < 10;i++)
            boundedWaitList.add((char)(Math.random() * 90));
        boundedWaitList.remove();
        System.out.println(boundedWaitList);

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        for (int i = 0; i < 10;i++)
            unfairWaitList.add((int)(Math.random() * 100));
        if (unfairWaitList.contains(10))
            unfairWaitList.moveToBack(10);
        System.out.print(unfairWaitList);
    }
}
