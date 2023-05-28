import java.util.Scanner;

public class L2Ex9 {
    //Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num = 1 ;
        int fat = 1;
        int cont = 1;

        do{
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            for (int i = 1; i<= num ; i++){
                fat = fat * i;
            }
            System.out.println("!" + num + "=" + fat);
            cont ++;
        } while (cont <2);
    }
}
