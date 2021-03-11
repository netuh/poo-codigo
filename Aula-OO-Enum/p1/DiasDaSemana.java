package p1;

public enum DiasDaSemana {
    DOMINGO (2, "Domingo"),
    SEGUNDA (1, "Segunda-feira"),
    TERCA (1, "Terça-feira"),
    QUARTA (1, "Quarta-feira"),
    QUINTA  (1, "Quinta-feira"),
    SEXTA  (0.5f, "Sexta-feira"),
    SABADO  (1.5f, "Sábado");

    private float modificador;
    private String nome;

    DiasDaSemana(float valor, String nome){
        modificador = valor;
        this.nome =nome;
    }

    public float getModificador(){
        return modificador;
    }

    public String getNome(){
        return nome;
    }
}
