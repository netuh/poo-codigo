public class Aplicacao{
    
    public static void main(String[] args) {
        System.out.println("test");
        String[] nomes = new String [4];
        String[] nomes2 = new String [4];
        int[] idades = new int[5];
        nomes[0] = "Adriano";
        nomes[1] = "Djalma";
        nomes[2] = "Joao";
        nomes[3] = "Lucas";

        for (int i = 0; i < nomes2.length; i++) {
            nomes2[i] ="neto";
            //String umNome2 = nomes[i];
            //umNome2 = "neto";
            //System.out.println("nome "+ umNome2);
        }

        // for (String umNome : nomes) {
        //     System.out.println("nome "+ umNome);
        // }

        for (String umNome : nomes2) {
            umNome = "neto";
        }

        for (String umNome : nomes2) {
            //--- COMECA --- 
            if (umNome.length() > 5){
                System.out.println("Nome grande"+ umNome);
            }

            
            System.out.println("nome "+ umNome);
            System.out.println("outra linha");
            //--- FIM --- 
        }

        for (int i = 0; i < nomes2.length; i++) {
            String umNome2 = nomes2[i];
            //--- COMECA --- 
            System.out.println("nome "+ umNome2);
            System.out.println("outra linha");
            //--- FIM --- 
        }
    }
}