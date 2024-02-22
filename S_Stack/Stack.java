/*
** classe stack
*/

package S_Stack;

/*import java.io.*;
import java.util.Stack;
import java.util.Scanner;*/
import java.util.ArrayList;

public class Stack<T> {
    
    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<T>();
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

  /*public void PushPop(){
    Stack<String> stack = new Stack<>();
		
		try{
		    File inputFile = new File("LeggiScriviFile.txt");
		    Scanner scanner = new Scanner(inputFile);
		    
		    if(scanner.hasNextLine()){
		        String line = scanner.nextLine();
		        stack.push(line);
		    }
		    scanner.close();
		    File outputFile = new File("FileOutput.txt");
		    FileWriter writer = new FileWriter(outputFile);
		        
		    if(!stack.isEmpty()){
		        writer.write(stack.pop() + "\n");
		    }
	    }
    }*/
}
