import Metodos.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nArrayList");
        CustomArrayList<String> arrayList = new CustomArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("soy");
        arrayList.add("Jorge");
        arrayList.remove("Mundo soy");
        arrayList.update(3, "Marvin");
        arrayList.iterate();


        System.out.println("\nVector");
        CustomVector<Integer> vector = new CustomVector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.remove(2);
        vector.update(1, 45);
        vector.iterate();

        System.out.println("\nLinkedList");
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(2);
        linkedList.update(1, 45);
        linkedList.iterate();

        System.out.println("\nPriorityQueue");
        CustomPriorityQueue<String> pq = new CustomPriorityQueue<>();
        pq.add("primero");
        pq.add("segundo");
        pq.add("tercero");
        pq.iterate();
        pq.remove();
        pq.iterate();

        System.out.println("\nHashSet");
        CustomHashSet<String> hs = new CustomHashSet<>();
        hs.add("Margarita");
        hs.add("Rosa");
        hs.add("Rosa"); //Dado que estaria repetido NO se añadira de nuevo
        hs.add(null); //Hash set admite null
        hs.add("Dandelion");
        hs.add("Petunia");
        hs.remove("Dandelion");
        hs.iterate(); //Orden impredecible

        System.out.println("\nLinkedHashSet");
        CustomLinkedHashSet<String> lhs = new CustomLinkedHashSet<>();
        lhs.add("Margarita");
        lhs.add("Rosa");
        lhs.add("Rosa"); //Dado que estaria repetido NO se añadira de nuevo
        lhs.add(null); //Linked Hash set admite null
        lhs.add("Dandelion");
        lhs.add("Petunia");
        lhs.remove("Dandelion");
        lhs.iterate(); //Orden PREDECIBLE

        System.out.println("\nTreeSet");
        CustomTreeSet<Integer> ts = new CustomTreeSet<Integer>();
        ts.add(10);
        ts.add(1);
        ts.add(50);
        ts.add(40);
        ts.add(45);
        ts.remove(40);
        ts.iterate(); //Los treesets son ordenados por su orden natural, en este caso, ascendiente
    }
}
