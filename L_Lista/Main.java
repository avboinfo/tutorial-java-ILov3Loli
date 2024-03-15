package L_Lista;

public class Main {
    public static void main(String[] args){
        System.out.println("Partiti!");
        Lista l = new Lista();

        /*Nodo n = new Nodo(100,null);   elementi del nodo
        System.out.println(n);*/
 
        /* for(int i=0;i<10;i++){
            l.addTail(new Nodo(i,null));
        }
        l.addHead(new Nodo(2024,null));  */

        l.addSorted(new Nodo(300,null));
        l.addSorted(new Nodo(250,null));
        l.addSorted(new Nodo(350,null));
        l.addSorted(new Nodo(320,null));
        l.addSorted(new Nodo(100,null));
        l.addSorted(new Nodo(170,null));
        l.addSorted(new Nodo(290,null));
        l.addSorted(new Nodo(450,null));

        l.addAfter(new Nodo(1,null),2);
        /*l.removePos(new Nodo(100,null),10);
        l.removeValue(new Nodo(100,null),11);*/

        System.out.println(l);

        Lista.Iteratore iter = l.getIteratore();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
