package DIO.java.primeiraSemanaAnatomia;
public class anatomiaaula3 {
    public static void main (String [] args) {
        /*Variavel de tipo String de saida Nome*/
        String meuNome = "Eliseu";
        /*Variavel tipo inteiro saida Ano com valor 2022*/
        int anoFrabicacao = 2022;
        /*Variavel do tipo Boleano Verdadeiro ou falso, com a saida false */
        boolean verdadeira = false;
        /*Variavel indicando o primeiro e segundo argumento da Classe nomeCompleto*/
        String primeiroNome = "Eliseu"; 
        String segundoNome = "Francisco";

        /*Variavel atribuindo classe nomeCompleto com os parametros adicionados realocando para variavel nomeCompleto */
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto); /*Saindo nome nomeCompleto*/
    }

    /*Classe nomeCompleto e seus parametros com retorno dos parametros*/
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
