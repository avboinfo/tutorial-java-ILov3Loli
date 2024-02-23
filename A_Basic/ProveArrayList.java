import java.util.ArrayList;
import java.util.Collections;

public class ProveArrayList {
    
    public static void main(String[] args){
        System.out.println("Questo codice funziona!");

        ArrayList<String> a = new ArrayList<>(); 
        a.add("uno");
        a.add("Babina");
        a.add("tre");
        a.add("quattro");
        a.add("cinque");

        a.remove("Babina");
        a.add(1,"due");
        //Collections.sort(a);  

        for (String s : a) {
            System.out.println(s);            //entrambi i for fanno la stessa cosa
        }
        for(int i=0;i<a.size();i++){
            String s = a.get(i);
            System.out.println(s);
        }
        System.out.println(a);
        System.out.println("Ancona".compareTo("Bologna"));

        
    }
}
