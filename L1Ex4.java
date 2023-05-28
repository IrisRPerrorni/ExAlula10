import java.util.Scanner;

public class L1Ex4 {
    //Escreva, usando while, um programa para calcular a média de N números.
    // O valor de N é dado pelo usuário.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantos números você irá utilizar para calular a média: ");
        int n = entrada.nextInt();
        double soma = 0;

        int i = 1;
        while (i<=n){
            System.out.print("Digite o " + i + "º número: " );
            double num = entrada.nextDouble();
            i++;
            soma+=num;

        }
        double media = soma / n;
        System.out.printf("A média é %.2f: " , media);



    }
}
