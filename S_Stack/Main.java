/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

package S_Stack;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        s.ScrivoFile();
        System.out.println(s.pop());
        System.out.println(s);
    }

}
