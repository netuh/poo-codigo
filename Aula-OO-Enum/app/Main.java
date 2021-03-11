package app;

import cartas.Carta;

public class Main {
    public static void main(String[] args) {
        Carta c = new Carta("Ilha");

        System.out.println(c.getNome());
        System.out.println(c.getCor());
    }
}
