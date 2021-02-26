import java.util.Scanner;

public class Lojinha {

    public static int achaPosicao(int numCarta, int[] numCartas, int ultimoIndice){
        for (int i = 0; i < ultimoIndice; i++) {
            if (numCarta == numCartas[i]){
                return i;
            }
        }
        return -1;
    }

    public static void menu(){
        System.out.println("Digite o que deseja fazer");
        System.out.println("1 - para Anunciar uma carta");
        System.out.println("2 - para Remover uma carta");
        System.out.println("3 - para Listar todas as cartas");
        System.out.println("5 - para Sair");
    }

    public static void main(String[] args) {
        int opcao;
        String nome, desc;
        int num, ano;
        float preco;
        Scanner s = new Scanner(System.in);
        int ultimoIndice = 0;
        
        int [] numCarta = new int[100];
        String [] nomeCarta = new String[100];
        String [] descCarta = new String[100];
        int [] anoCarta = new int[100];
        float [] precoCarta = new float[100];

        numCarta[ultimoIndice] = 1;
        nomeCarta[ultimoIndice] = "Black Lotus";
        descCarta[ultimoIndice] = "Vintage Masters";
        anoCarta[ultimoIndice] = 1993;
        precoCarta[ultimoIndice] = 39999;
        ultimoIndice++;

        System.out.println("Bem vindo");
        menu();
        System.out.print("->");
        opcao = s.nextInt();
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    ultimoIndice = acionaCarta(s, ultimoIndice, numCarta, nomeCarta, descCarta, anoCarta, precoCarta);
                    break;
                case 2:
                    System.out.println("Digite o numero da carta a ser removida");
                    num = s.nextInt();
                    int indice = achaPosicao(num, numCarta, ultimoIndice);
                    if (indice != -1){
                        for (int i = indice; i < ultimoIndice; i++) {
                            numCarta[i] = numCarta[i+1];
                            nomeCarta[i] = nomeCarta[i+1];
                            descCarta[i] = descCarta[i+1];
                            anoCarta[i] = anoCarta[i+1];
                            precoCarta[i] = precoCarta[i+1];
                        }
                        ultimoIndice--;
                    } else{
                        System.out.println("Carta não encontrada");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Cartas");
                    for (int i = 0; i < ultimoIndice; i++) {
                        System.out.printf("A carta: %s e numero %d tem preco %.2f \n", nomeCarta[i], numCarta[i], precoCarta[i]);
                    }
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

    private static int acionaCarta(Scanner s, int ultimoIndice, int[] numCarta, String[] nomeCarta, String[] descCarta,
            int[] anoCarta, float[] precoCarta) {
        String nome;
        String desc;
        int num;
        int ano;
        float preco;
        System.out.println("Digite o numero da carta");
        num = s.nextInt();
        s.nextLine();
        System.out.println("Digite o nome da carta");
        nome = s.nextLine();
        System.out.println("Digite o Descrição da carta");
        desc = s.nextLine();
        System.out.println("Digite o ano da carta");
        ano = s.nextInt();
        s.nextLine();
        System.out.println("Digite o preco da carta");
        preco = s.nextFloat();

        System.out.printf("\nA carta %s tem o preco de %.2f \n\n", nome, preco);

        numCarta[ultimoIndice] = num;
        nomeCarta[ultimoIndice] = nome;
        descCarta[ultimoIndice] = desc;
        anoCarta[ultimoIndice] = ano;
        precoCarta[ultimoIndice] = preco;
        ultimoIndice ++;
        return ultimoIndice;
    }
}