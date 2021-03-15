package logica;

public class Conta {

    protected float saldo;

    public Conta (){
        saldo = 0;
    }

    public void depositar(float valor) {
        //saldo = saldo +valor;
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float novoSaldo) {
        saldo = novoSaldo;
    }

    public boolean sacar(float valorSaque) {
        if (saldo > valorSaque){
            saldo -= valorSaque;
            return true;
        }
        return false;
    }
    
}
