package Metodos;

import Interface.Metodo;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CustomVector<T> implements Metodo<T> {
    private List<T> vector = new Vector<T>();

    @Override
    public void add(T el) {
        vector.add(el);
    }

    @Override
    public void remove(T el) {
        vector.remove(el);
    }

    @Override
    public void update(int el, T nuevoEl) {
        vector.set(el, nuevoEl);
    }

    @Override
    public void iterate() {
        Iterator value = vector.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
