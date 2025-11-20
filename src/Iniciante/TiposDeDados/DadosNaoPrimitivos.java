package Iniciante.TiposDeDados;

public class DadosNaoPrimitivos {
    /*
        Dados não primitivos: String, Array, Class, enum
     */

    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String missao1 = "Achar tesouro";
        String status1;
        char nivel1 = 'A';

        if ((idadeNinja1 < 15) && (nivel1 == 'C' || nivel1 == 'D')) {
            status1 = "Concluída";
        } else {
            status1 = "Não concluída";
        }

        System.out.println("======================");
        System.out.println("======================");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Missao do ninja: " + missao1);
        System.out.println("Status da missao do ninja: " + status1);
        System.out.println("Nivel da missao do ninja: " + nivel1);

        System.out.println("======================");
        System.out.println("======================");


        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 20;
        String missao2 = "Achar bandido";
        String status2 = "Encerrado";
        char nivel2 = 'D';

        System.out.println("===================================");
        System.out.println("===================================");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Missao do ninja: " + missao2);
        System.out.println("Status da missao do ninja: " + status2);
        System.out.println("Nivel da missao do ninja: " + nivel2);

        System.out.println("===================================");
        System.out.println("===================================");

        String nomeNinja3 = "Sakura";
        int idadeNinja3 = 25;
        String missao3 = "Recuperar feridos";
        String status3 = "Encerrado";
        char nivel3 = 'C';

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Missao do ninja: " + missao3);
        System.out.println("Status da missao do ninja: " + status3);
        System.out.println("Nivel da missao do ninja: " + nivel3);



    }
}
