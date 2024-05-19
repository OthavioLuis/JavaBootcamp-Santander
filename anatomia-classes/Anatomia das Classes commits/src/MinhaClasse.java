public class MinhaClasse {
    public static void main (String [] args) {
        /*String meuNome = "Othavio";

        int anoFabricacao = 2022;

        boolean verdadeira = true; 

        anoFabricacao = 2018; //Pode ser alterado*/
        
        //pode atribuir um valor ou não nas variaveis

        String primeiroNome = "Othavio";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
