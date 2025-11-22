package Intermediario;

public class Uchiha extends Ninja{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); //estou me referindo ao construtor da superclasse
    }


    //    @Override
//    public void habilidadeEspecial(){
//        System.out.println("Sou o "+nome+" e esse é meu ataque Uchiha.");
//    }

}
