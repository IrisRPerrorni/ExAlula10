import java.util.Scanner;

public class L3Ex2 {
    //Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar,
    // sabendo que a decisão é sempre pelo mais barato.

    public static void main(String[] args) {
        System.out.println("Qual produto comprar?");

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto R$:");
        double prod1 = ler.nextDouble();

        System.out.print("Digite o valor do segundo produto R$:");
        double prod2 = ler.nextDouble();

        System.out.print("Digite o valor do terceiro produto R$:");
        double prod3 = ler.nextDouble();

        if(prod1<prod2 && prod1<prod3){
            System.out.println("Comprar o primeiro produto:");

        } else if ( prod2<prod1 && prod2<prod3){
            System.out.println("Comprar o segundo produto:");

        } else if( prod3<prod2 && prod3<prod1) {
            System.out.println("Comprar o terceiro produto:");

        }else if( prod1==prod2 && prod1<prod3){
            System.out.println("Comprar o primeiro ou o segundo produto:");

        } else if (prod1 == prod3 && prod1<prod2){
            System.out.println("Comprar o primeiro ou o terceiro produto:");

        } else if(prod3 == prod2 && prod3<prod1) {
            System.out.println("Comprar o segundo ou o terceiro produto:");

        } else {
            System.out.println("Os três produtos tem os mesmo valores:");
        }


    }
}
