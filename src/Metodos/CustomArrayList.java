package Metodos;

import Interface.Metodo;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList<T> implements Metodo<T> {
    private List<T> lista = new ArrayList<>();

    @Override
    public void add(T el) {
        lista.add(el);
    }

    @Override
    public void remove(T el) {
        lista.remove(el);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(int el, T nuevoEl) {
        lista.set(el, nuevoEl);
    }

    @Override
    public void iterate() {
        System.out.println(lista.toString());
    }
}
