package ProntoSoccorso;
import java.util.*;
import java.io.*;

public class ProntoSoccorso {
    Lista<Paziente> ps;

    public ProntoSoccorso(){
        ps = new Lista<>();
        loadFromFile();
    }

    private void loadFromFile(){
        ps.addTail(new Paziente("Mario","Rossi","white"));
        ps.addTail(new Paziente("Maria","Rossi","yellow"));
        ps.addTail(new Paziente("Benedetta","Italia","yellow"));
        ps.addTail(new Paziente("Riccardina","Gamberini","red"));
    }

    public String toString(){
        return "Pronto Soccorso [ps=" + ps + "]";
    }
}
