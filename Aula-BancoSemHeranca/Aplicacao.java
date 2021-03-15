import java.util.Scanner;

public class Aplicacao {

    public static void menu(){
        System.out.println("Digite o que deseja fazer");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Depositar em Conta");
        System.out.println("4 - Saque em Conta");
        System.out.println("5 - Desativar Conta");
        System.out.println("6 - Render Poupanca");
        System.out.println("10 - para Sair");
    }

    public static void main(String[] args) {
        Banco bancoCat = new Banco();
        int opcao;
        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo");
        menu();
        System.out.print("->");
        opcao = s.nextInt();

        while (opcao != 10) {
            switch (opcao) {
                case 1:
                    // Criar Conta
                    System.out.println("Deseja criar Conta Corrente (digite 1)");
                    System.out.println("Deseja criar Poupanca (digite 2)");
                    int contaOpcao = s.nextInt();
                    if ( contaOpcao == 1){
                        int numeroDaConta = bancoCat.criarConta();
                        System.out.println("Conta criada com o seguinte número: " + numeroDaConta);
                    } else if (contaOpcao == 2){
                        int numeroDaConta = bancoCat.criarContaPoupanca();
                        System.out.println("Conta criada com o seguinte número: " + numeroDaConta);
                    } else {
                        System.out.println("Opcao Inválida");
                    }


                    
                    break;
                case 2:
                    // Consultar Saldo
                    System.out.println("Qual o número da Conta que deseja consultar?");    
                    System.out.print("->");
                    int numContaSaldo = s.nextInt();
                    System.out.println("Deseja consultar Conta Corrente (digite 1)");
                    System.out.println("Deseja consultar Poupanca (digite 2)");
                    int contaOpcaoSaldo = s.nextInt();
                    if ( contaOpcaoSaldo == 1){
                        float saldo = bancoCat.consultarSaldo(numContaSaldo);
                    System.out.println("O saldo da conta "+ numContaSaldo + " eh " + saldo);
                    } else if (contaOpcaoSaldo == 2){
                        float saldo = bancoCat.consultarSaldoPoup(numContaSaldo);
                    System.out.println("O saldo da conta "+ numContaSaldo + " eh " + saldo);
                    } else {
                        System.out.println("Opcao Inválida");
                    }
                    break;
                case 3:
                    // Depositar
                    System.out.println("Qual o número da Conta que deseja realizar o deposito?");    
                    System.out.print("->");
                    int numConta = s.nextInt();
                    System.out.println("Qual o valor do deposito?");    
                    System.out.print("->");
                    float valor = s.nextFloat();
                    bancoCat.deposite(numConta, valor);
                    System.out.println("Valor depositado");
                    break;
                
                case 4:
                    // Sacar
                    System.out.println("Qual o número da Conta que deseja realizar o saque 😁?");    
                    System.out.print("->");
                    int numContaSaque = s.nextInt();
                    System.out.println("Qual o valor do saque?");    
                    System.out.print("->");
                    float valorSaque = s.nextFloat();
                    boolean status = bancoCat.saque(numContaSaque, valorSaque);
                    if (status == true){
                        System.out.println("Saque realizado com sucesso");
                    } else {
                        System.out.println("Ñao foi possível realizar o saque");
                    }
                    break;
                case 5:
                    // Desativar
                    break;
                case 6:
                    // Render
                    System.out.println("Qual o número da Poupanca que deseja fazer render?");    
                    System.out.print("->");
                    int numContaPoup = s.nextInt();
                    bancoCat.render(numContaPoup);
                    float saldo = bancoCat.consultarSaldoPoup(numContaPoup);
                    System.out.println("O novo saldo é "+ saldo);    
                    break;
                default:
                    System.out.println("Ainda não implementado");
                    break;
            }
            menu();
            System.out.print("->");
            opcao = s.nextInt();
        }
        System.out.println("Adeus");
    }
}
