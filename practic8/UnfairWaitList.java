package ru.mirea.practic8;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() { }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        for (E elem : content) {
            if (elem.equals(element)) {
                remove(element);
                add(element);
                break;
            }
        }
    }
}
