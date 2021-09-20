package Metodos;

import Interface.Metodo;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CustomPriorityQueue<T> implements Metodo<T> {
    private PriorityQueue<T> priorityQueue = new PriorityQueue<T>();
    @Override
    public void add(T el) {
        priorityQueue.add(el);
    }

    @Override
    public void remove(T el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove() {
        priorityQueue.remove();
    }

    @Override
    public void update(int el, T nuevoEl) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void iterate() {
        System.out.println("TOPE DE LA QUEUE "+priorityQueue.peek());
        Iterator iterator = priorityQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
    }
}
