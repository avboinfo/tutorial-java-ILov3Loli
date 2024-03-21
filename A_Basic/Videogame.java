public class Videogame {
    String nome, marca;
    float costo;
    int annoPublicazione;

    public Videogame(String nome, String marca, float costo, int annoPublicazione){
        this.costo = costo;
        this.nome = nome;
        this.marca = marca;
        this.annoPublicazione = annoPublicazione;
    }

    public String toString(){
        return "nome: " + nome + " marca: " + marca + " costo: " + costo + " anno di pubblicazione: " + annoPublicazione;
    }
}
