package Intermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //Método geral
    public void habilidadeEspecial(){
        System.out.println("Sou o "+nome+" e esse é meu ataque especial.");
    }

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Eu sou: "+nome+" e pensei na estratégia de combate.");
    }

    public Ninja(){}

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}
