public class Aplicacao {
    public static void main(String[] args) {
        SolucionadorBaskara b = new SolucionadorBaskara(3,0,-27);
        System.out.println("a raiz 1 = "+ b.primeiraRaiz());
        System.out.println("a raiz 2 = "+ b.segundaRaiz());
        SolucionadorBaskara b2 = new SolucionadorBaskara(1,-3,-10);
        System.out.println("a raiz 1 = "+ b2.primeiraRaiz());
        System.out.println("a raiz 2 = "+ b2.segundaRaiz());
    }
}
