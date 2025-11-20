package Iniciante.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha: ");
        System.out.println("1 - Palmeiras");
        System.out.println("2 - Vasco");
        System.out.println("3 - Cuiabá");

        int escolhaDoUsuario = scanner.nextInt();
        switch (escolhaDoUsuario) {
            case 1 :
                System.out.println("AVANTI PALESTRA");
                break;
            case 2 :
                System.out.println("É O VASCUDO");
                break;
            case 3 :
                System.out.println("SIMBÓRA CUIABAYERN");
                break;
            default:
                System.out.println("Não há essa opção!");
        }

        scanner.close();
    }

}
