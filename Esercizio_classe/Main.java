package Esercizio_classe;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
        Stack<String> s = new Stack <String>();
        File f = new File("Esercizio_classe/DatiIn.txt");

    try{
        Scanner scanner = new Scanner(f);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            s.Push(line);
        }
        scanner.close();
    }catch(Exception e){
        System.out.println("Error: " + e.toString());
    }
    System.out.println(s);
} 
}

