import java.util.Scanner;

public class L2Ex2 {
    //Faça um programa que leia n números inteiros e imprima sua média.

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite quantos números você irá utilizar para calular a média: ");
        int num = ler.nextInt();
        double soma = 0;

        for(int i = 1 ; i<= num ; i++){
            System.out.print("Digite o " + i + "º número: " );
            double n = ler.nextDouble();
            soma += n;
        }
        double media = soma / num;
        System.out.printf("A média é %.2f: " , media );

    }

}
