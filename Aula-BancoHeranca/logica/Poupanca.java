package logica;

public class Poupanca extends Conta{
    
    public Poupanca(){
        super();
    }

    public void render(){
        float redimento = saldo *0.01f;
        saldo = saldo + redimento;
    }
}
