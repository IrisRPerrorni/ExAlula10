import java.util.Scanner;

public class L3Ex1 {
    //Faça um programa que receba dois números e imprima o maior deles.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o maior número? ");
        System.out.print("Insira um número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Insira outro numero: ");
        double num2 = entrada.nextDouble();

        if (num1>num2){
            System.out.println("O número " + num1 + " é o maior");
        } else {
            System.out.println("O número " + num2+ " é o maior.");
        }

    }
}
