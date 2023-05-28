import java.util.Scanner;

public class L2Ex4 {
    //Faça um programa que leia n números positivos e calcule a soma desses números.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // leitor do cliente

        System.out.print("Digite quantos números você irá utilizar para calular a sua soma: "); // Imprima
        int num = ler.nextInt();  // ler

        System.out.println(" Digite os numeros que irão somar (somente números positivos)");

        double soma = 0;
        for (int i = 1; i <= num; i ++) {
            System.out.print("Digite o  " + i + " ° numero: ");
            double numero = ler.nextDouble();
            if(numero>0){
                soma += numero;

            } else {
                System.out.println("Valor incorreto!!");
                System.exit(0);
            }
        }
        System.out.print("A soma dos números são: " + soma);
    }
}
