package Iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = caixaDeTexto.nextLine();

        System.out.println("Digite a idade: ");
        int idade = caixaDeTexto.nextInt();

        if (idade > 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade");
        }

        caixaDeTexto.close();


    }
}
