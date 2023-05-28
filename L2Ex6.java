import java.util.Scanner;

public class L2Ex6 {

    //Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
    // O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar
    // todos os números ímpares contidos neste intervalo.
    // Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final) deve ser escrito
    // uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Vamos somar os números ímpares contidos em um intervalo que você irá solicitar");

        System.out.print("Defina o valor inicial do intervalo: ");
        int inicio = ler.nextInt();

        System.out.print("Defina o valor final do intervalo: ");
        int fim = ler.nextInt();

        int soma = 0;

        if(inicio<fim){
            System.out.println(" Os numeros impares são: ");
            for ( int i = inicio ; i <= fim; i++){
                 if ( i % 2 != 0){
                     soma+= i ;
                     System.out.println( i );
                 }
            }
            System.out.print( "o valor da soma: "+ soma);

        } else {
            System.out.println("Intervalo de valores inválido");
            System.exit(0);
        }

    }
}
