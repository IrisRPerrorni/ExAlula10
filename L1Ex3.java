import java.util.Scanner;

public class L1Ex3 {
    //Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double soma = 0;
        System.out.println("Calculadora de soma:" );

        for(int i = 1; i<=5; i++){
            System.out.print("Digite o " + i + "º número:" );
            double num = entrada.nextDouble();
            soma += num ;
        }
        System.out.print("A soma dos números são:" + soma);









    }
}
