package Metodos;

import Interface.Metodo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet<T> implements Metodo<T> {
    private final Set<T> treeSet = new TreeSet<>();
    @Override
    public void add(T el) {
        treeSet.add(el);
    }

    @Override
    public void remove(T el) {
        treeSet.remove(el);
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
        for (T t : treeSet) {
            System.out.print(t+" ");
        }
    }
}
