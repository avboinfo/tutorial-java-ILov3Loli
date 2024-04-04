package L_Lista;

public class NodoGen<T> {
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore){
        this.valore=valore;
        successivo = null;
    }

    public void SetValore(T nuovovalore){
        valore = nuovovalore;
    }

    public NodoGen<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(NodoGen<T> successivo) {
        this.successivo = successivo;
    }

    public T GetValore(){
        return valore;
    }

    public String toString(){
        return "Il mio valore è: " + valore;
    }
}
