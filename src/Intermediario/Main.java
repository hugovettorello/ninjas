package Intermediario;

import Intermediario.Construtores.Hokages;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Folha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Folha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha("Itachi", "Folha", 17);
        itachi.habilidadeEspecial();
    }
}
