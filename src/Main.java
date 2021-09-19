import Metodos.CustomArrayList;

public class Main {
    public static void main(String[] args){
        CustomArrayList<String> arrayList = new CustomArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Mundo soy");
        arrayList.add("Jorge");
        arrayList.remove("Mundo soy");
        arrayList.update(1, "Olmedo");
        arrayList.iterate();
    }
}
