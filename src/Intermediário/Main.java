package Intermediário;

public class Main {
    public static void main(String[] args) {
        //Criar ninja por meio de um objeto

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 20;
        Sasuke.SharinganAtivado();

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia= "Aldeia do Deserto";
        Naruto.modoSabio();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.AtivarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.AtivarByakugan();


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";

    }
}
