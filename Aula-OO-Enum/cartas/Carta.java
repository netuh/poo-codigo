package cartas;

public class Carta {
    private Cor corCarta;
    private String nome;

    public Carta(String nome){
        this.nome = nome;
        corCarta = Cor.AZUL;
    }

    public String getNome(){
        return nome;
    }

    public Cor getCor(){
        return corCarta;
    }

}
