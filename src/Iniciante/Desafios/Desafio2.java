package Iniciante.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("============================================");
            System.out.println("============ CADASTRO DE NINJAS ============");
            System.out.println("============================================");
            System.out.println("\n");
            System.out.println("1 - Cadastrar ninjas");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Encerrar programa");
            System.out.print("Digite uma das opções acima: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados <= NUMERO_MAX) {
                        System.out.print("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();

                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("NINJA CADASTRADO COM SUCESSO!");
                    }else{
                        System.out.println("O número de ninjas cadastrados já atingiu o seu máximo.");
                    }
                    break;
                case 2:
                    if(ninjasCadastrados == 0) {
                        System.out.println("NÃO HÁ NINJAS CADASTRADOS");
                    }else{
                        System.out.println("================== LISTA DE NINJAS ==================");
                        System.out.println("\n");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("=========== PROGRAMA FINALIZADO ===========");
                    break;
                default:
                    System.out.println("=========== ESSA OPÇÃO NÃO É VÁLIDA ===========");
                    break;
            }
        }

        scanner.close();


    }
}
