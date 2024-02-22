package Esercizio_classe;
import java.util.ArrayList;

public class Stack<T> {
    ArrayList <T> lista;

    public Stack(){
        lista = new ArrayList<T>();
    }

    public void Push(T newElement){
        lista.add(newElement);
    }

    public int size(){
        return lista.size();
    }

    public T pop(){
        int size = lista.size();
        if (size == 0) return null;
        T x = lista.get(size-1);
        lista.remove(size-1);
        return x;
    }

    public String toString(){
        String s = "Contenuto della pila:\n";
        for(int i=0;i<lista.size();i++){
            s += lista.get(i) + "\n";
        }
        return s;
    }
}
