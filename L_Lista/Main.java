package L_Lista;

public class Main {
    public static void main(String[] args){
        System.out.println("Partiti!");
        Lista l = new Lista();

        /*Nodo n = new Nodo(100,null);   elementi del nodo
        System.out.println(n);*/
 
        for(int i=0;i<10;i++){
            l.add(new Nodo(i,null));
        }
        System.out.println(l);
    }
}
