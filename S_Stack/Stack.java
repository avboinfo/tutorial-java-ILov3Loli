/*
** classe stack
*/

package S_Stack;

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Stack<T> {
    
    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<T>();
    }

    public void ScrivoFile(){
        try{
            File FileScrivi = new File("InputFile.txt");
            System.out.println("Scrivi qualcosa");
            Scanner Testo = new Scanner(FileScrivi);
            while(Testo.hasNextLine()){
            String data = Testo.nextLine();
        }
        Testo.close();
        }catch(FileNotFoundException e){
            System.out.println("Errore!");
            e.printStackTrace();
        }
        return;
    } 
    
    public void push( T newElement ) {
        list.add(newElement);
    }

    public T pop() {
        int size = list.size();
        if (size==0) return null;
        T x = list.get(size-1);
        list.remove(size-1);
        return x;
    }
    
    public String toString() {
        String s = "Contenuto della pila:\n";
        for (int i=0; i<list.size(); i++) {
            s += list.get(i) + "\n";
        }
        return s;
    }    
}
