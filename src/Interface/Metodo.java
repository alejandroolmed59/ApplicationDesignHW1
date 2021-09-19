package Interface;

public interface Metodo<T> {
    public void add(T el);
    public void remove(T el);
    public void update(int el, T nuevoEl);
    public void iterate();
}
