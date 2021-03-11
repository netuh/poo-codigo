public class SolucionadorDelta{
    float a;
    float b;
    float c;

    public SolucionadorDelta(float a1, float b, float c){
        this.a = a1;
        this.b = b;
        this.c = c; 
    }

    public double calculaDelta(){
        return b*b - 4*a*c;
    }
}