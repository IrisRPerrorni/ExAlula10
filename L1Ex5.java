import java.util.Scanner;

public class L1Ex5 {
    //Faça um programa para zerar a fila de um banco.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos zera a fila do banco?");
        System.out.print(" Digite quantas pessoas estão na fila do banco: ");
        int n = entrada.nextInt();
        do {
            System.out.println("Tem "+ n + " Pessoas na sua frente");
            n--;
        } while (n >= 0);

    }
}
