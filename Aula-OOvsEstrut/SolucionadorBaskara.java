public class SolucionadorBaskara {
    float a;
    float b;
    SolucionadorDelta d;

    public SolucionadorBaskara(float a, float b, float c) {
        d = new SolucionadorDelta (a, b, c);
        this.a = a;
        this.b = b;
    }

    public double primeiraRaiz(){
        double resDelta = d.calculaDelta();
        return (-b + Math.sqrt(resDelta))/2*a;
    }

    public double segundaRaiz(){
        double resDelta = d.calculaDelta();
        return (-b - Math.sqrt(resDelta))/2*a;
    }

}
