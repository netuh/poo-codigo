package logica;

public class Banco{
    private Conta [] contas;
    private int indiceDisponivel;

    public Banco(){
        indiceDisponivel = 0;
        contas = new Conta[100];
    }

    public int criarConta() {
        contas[indiceDisponivel] = new Conta();
        int contaCriada = indiceDisponivel++;
        return contaCriada;
    }

    public int criarContaPoupanca() {
        contas[indiceDisponivel] = new Poupanca();
        int contaCriada = indiceDisponivel++;
        return contaCriada;
    }

    public void deposite(int numConta, float valor) {
        if (numConta < indiceDisponivel){
            contas[numConta].depositar(valor);
        }
    }

    public float consultarSaldo(int numContaSaldo) {
        if (numContaSaldo < indiceDisponivel){
            return contas[numContaSaldo].getSaldo();
        }
        return -1;
    }

    public boolean saque(int numContaSaque, float valorSaque) {
        if (numContaSaque < indiceDisponivel){
            return contas[numContaSaque].sacar(valorSaque);
        }
        return false;
    }

    public void render(int numConta) {
        if (numConta < indiceDisponivel){
            Poupanca p = (Poupanca)contas[numConta];
            p.render();
        }
    }
}