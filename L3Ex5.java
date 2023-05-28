import java.util.Scanner;

public class L3Ex5 {
    //Faça um Programa que receba um número e exiba o dia correspondente da semana.
    // (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido”.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos ver os dias da semana!");
        System.out.println("Digite um número de (1 - 7) ");
        int resp = entrada.nextInt();

        switch (resp){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("valor inválido");
        }
    }
}
