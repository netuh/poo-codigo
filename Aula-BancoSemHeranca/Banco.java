public class Banco{
    private Conta [] contas;
    private Poupanca [] poupancas;
    private int indiceDisponivel;
    private int indiceDisponivelPoupanca;

    public Banco(){
        indiceDisponivel = 0;
        indiceDisponivelPoupanca = 0;
        contas = new Conta[100];
        poupancas = new Poupanca[100];
    }

    public int criarConta() {
        contas[indiceDisponivel] = new Conta();
        int contaCriada = indiceDisponivel++;
        return contaCriada;
    }

    public int criarContaPoupanca() {
        poupancas[indiceDisponivelPoupanca] = new Poupanca();
        int contaCriada = indiceDisponivelPoupanca++;
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

    public float consultarSaldoPoup(int numContaSaldo) {
        if (numContaSaldo < indiceDisponivelPoupanca){
            return poupancas[numContaSaldo].getSaldo();
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
        if (numConta < indiceDisponivelPoupanca){
            poupancas[numConta].render();
        }
    }
}