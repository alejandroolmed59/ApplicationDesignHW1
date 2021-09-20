package Metodos;

import Interface.Metodo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomHashSet<T> implements Metodo<T> {
    private Set<T> myHashSet = new HashSet<T>();

    @Override
    public void add(T el) {
        myHashSet.add(el);
    }

    @Override
    public void remove(T el) {
        myHashSet.remove(el);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(int el, T nuevoEl) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void iterate() {
        for (T t : myHashSet) {
            System.out.print(t + " ");
        }
        System.out.println("");
    }
}
