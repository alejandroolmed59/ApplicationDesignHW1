import Metodos.CustomArrayList;
import Metodos.CustomLinkedList;
import Metodos.CustomPriorityQueue;
import Metodos.CustomVector;

public class Main {
    public static void main(String[] args){

        CustomArrayList<String> arrayList = new CustomArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Mundo soy");
        arrayList.add("Jorge");
        arrayList.remove("Mundo soy");
        arrayList.update(1, "Olmedo");
        arrayList.iterate();

        CustomVector<Integer> vector = new CustomVector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.remove(2);
        vector.update(1, 45);
        vector.iterate();

        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(2);
        linkedList.update(1, 45);
        linkedList.iterate();

        CustomPriorityQueue<String> pq = new CustomPriorityQueue<>();
        pq.add("Entro primero :D");
        pq.add("Entro segundo :D");
        pq.add("Entro tercero D:");
        pq.iterate();
        pq.remove();
        pq.iterate();
    }
}
