package cartas;

public class Deck {
    
    public static void main(String[] args) {
        Carta c = new Carta ("Montanha");

        c.corCarta = Cor.PRETO;
        System.out.println(c.getNome());
        System.out.println(c.getCor());
    }
}
