package Metodos;

import Interface.Metodo;

import java.util.LinkedHashSet;
import java.util.Set;

public class CustomLinkedHashSet<T> implements Metodo<T> {
    private Set<T> linkedHashSet = new LinkedHashSet<>();
    @Override
    public void add(T el) {
        linkedHashSet.add(el);
    }

    @Override
    public void remove(T el) {
        linkedHashSet.remove(el);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(int el, T nuevoEl) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void iterate() {
        for (T t : linkedHashSet) {
            System.out.print(t + " ");
        }
        System.out.println("");
    }
}
