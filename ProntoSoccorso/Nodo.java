package ProntoSoccorso;

import java.io.*;

public class Nodo<T> {
    private T valore;
    private Nodo<T> successivo;

    public Nodo(T valore){
        this.valore=valore;
        successivo = null;
    }

    public void SetValore(T nuovovalore){
        valore = nuovovalore;
    }

    public Nodo<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Nodo<T> successivo) {
        this.successivo = successivo;
    }

    public T GetValore(){
        return valore;
    }

    public String toString(){
        return "Il mio valore è: " + valore;
    }
}

