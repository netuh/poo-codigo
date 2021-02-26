public class RevisaoString {
    public static void main(String[] args) {
        int[] numeros = new int [10];
        char[] letras = {'N', 'e', 't', 'o'};
        letras[0] = 'B';
        numeros[0] = 1;
        String nome = "Neto";
        //nome[0] = 'B';
        nome = "Marcos";
        //      013456  
        System.out.println(nome);
        System.out.println(nome.charAt(0));
        nome = nome.substring(1);
        System.out.println(nome);

        if (nome.equals("arcos")){
        //if (nome == "arcos" ){ ERRADO!!!!!!!
            System.out.println("são iguais");
        } else{
            System.out.println("são diferentes");
        }

        if (nome.compareTo("zrcos") == 0){
        //if (nome == "arcos" ){ ERRADO!!!!!!!
                System.out.println("são iguais");
        } else{
            System.out.println("são diferentes");
        }


        int indice = nome.indexOf("z");
        System.out.println("o indice de a eh "+indice);
        
        indice = nome.indexOf("ca");
        System.out.println("o indice de co eh "+indice);


        String frase = "uma frase bem longa";
        indice = frase.indexOf("a", 5);
        System.out.println("o indice de co eh "+indice);

        indice = frase.indexOf("a");
        while (indice > 0) {
            System.out.println("o indice de a eh "+indice);
            indice = frase.indexOf("a", indice+1);
        }



        String nomeMin = "Neto";
        String nomeMai = "NETO";
        if (nomeMin.equalsIgnoreCase(nomeMai)) {
            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }

        String nomeOutro1 = nomeMin.toUpperCase();
        String nomeOutro2 = nomeMin.toLowerCase();
        System.out.println("pequena "+nomeOutro1);
        System.out.println("grande "+nomeOutro2);
    }
}
