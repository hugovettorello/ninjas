package Iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        //while

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones) {
//            System.out.println("O naruto fez um clone das sombras número: "+numeroDeClones);
//            numeroDeClones++;
//        }


        //for
        for (int i = 1; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez o clone número: "+i);
        }
    }
}
