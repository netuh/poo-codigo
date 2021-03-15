public class Poupanca {
    private float saldo;
    private float redimentoTotal;

    public Poupanca (){
        saldo = 100;
        redimentoTotal =0;
    }

    public void depositar(float valor) {
        //saldo = saldo +valor;
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean sacar(float valorSaque) {
        if (saldo > valorSaque){
            saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public void render(){
        float redimento = saldo *0.01f;
        redimentoTotal = redimentoTotal + redimento;
        saldo = saldo + redimento;
    }
}
