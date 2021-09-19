package Metodos;

import Interface.Metodo;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomLinkedList<T> implements Metodo<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();
    @Override
    public void add(T el) {
        linkedList.addLast(el);
    }

    @Override
    public void remove(T el) {
        linkedList.remove(el);
    }

    @Override
    public void remove() {
        linkedList.removeLast();
    }

    @Override
    public void update(int el, T nuevoEl) {
        linkedList.set(el, nuevoEl);
    }

    @Override
    public void iterate() {
        Iterator value = linkedList.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
