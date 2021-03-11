import p1.DiasDaSemana;

public class Problema{
    public static void main(String[] args) {
        DiasDaSemana d;
        d = DiasDaSemana.DOMINGO;
        System.out.println("dia da semana " + d);
        System.out.println("salario " + (1000 * d.getModificador()));
        System.out.println("nome correto " +d.getNome());
        d = DiasDaSemana.TERCA;
        System.out.println("dia da semana " + d);
        System.out.println("salario " + (1000 *  d.getModificador()));
        System.out.println("nome correto " +d.getNome());
    }
}