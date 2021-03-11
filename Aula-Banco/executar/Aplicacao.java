package executar;

import java.util.Scanner;

import logica.Banco;

public class Aplicacao {

    public static void menu(){
        System.out.println("Digite o que deseja fazer");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Depositar em Conta");
        System.out.println("4 - Saque em Conta");
        System.out.println("5 - Desativar Conta");
        System.out.println("6 - para Sair");
    }

    public static void main(String[] args) {
        Banco bancoCat = new Banco();
        int opcao;
        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo");
        menu();
        System.out.print("->");
        opcao = s.nextInt();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    // Criar Conta
                    System.out.println("Conta sendo criada");
                    int numeroDaConta = bancoCat.criarConta();
                    System.out.println("Conta criada com o seguinte número: " + numeroDaConta);
                    break;
                case 2:
                    // Consultar Saldo
                    System.out.println("Qual o número da Conta que deseja consultar?");    
                    System.out.print("->");
                    int numContaSaldo = s.nextInt();
                    float saldo = bancoCat.consultarSaldo(numContaSaldo);
                    System.out.println("O saldo da conta "+ numContaSaldo + " eh " + saldo);
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
