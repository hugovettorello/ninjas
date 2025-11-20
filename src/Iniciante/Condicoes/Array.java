package Iniciante.Condicoes;

public class Array {
    public static void main(String[] args) {

        //valor do endereço da memória daquele array


        //tipo do array + nome da variavel
        String[] ninja = new String[4];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }
    }
}
