package L_Lista;

public class MainGen{
    public static void main(String[] args) {
        ListaGen<String> ls = new ListaGen<>();
        //ls.addTail(new NodoGen<String>("Milan"));
        ls.addTail("Roma");
        ls.addTail("Juve");
        ls.addTail("Bologna");
        ls.addTail("Milan");
        System.out.println(ls);
    }
}
