package Iniciante.Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        short idade = scanner.nextShort();

        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(resultado);

        scanner.close();
    }
}
