import java.util.Scanner;

public class L2Ex7 {
    // Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
    // Um número primo é aquele que é divisível somente por ele mesmo e por 1.

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Esse programa indica se o número é primo");

        System.out.println("Digite um número inteiro ");
        int num = ler.nextInt();
        int divisor = 2;
        for(int i = 2 ; i< num ; i ++){
            if( num % i == 0){
                divisor ++;
        }
            }
        if (divisor == 2) {
                System.out.print("O numero é primo!");
            } else {
            System.out.println(" O número não é primo!");
        }

    }
}


