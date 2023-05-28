import java.util.Scanner;

public class L2Ex3 {

    //Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
       int maior = 0 , menor = 0 , num;

        for ( int i = 1 ; i<= 10; i++){
            System.out.print("Digite o  " + i +  " ° numero: ");
             num = ler.nextInt();
            if (i==1){
                maior = num;
                menor = num;
            } else {
                if (num< menor){
                    menor = num;
                } if (num > maior){
                    maior = num;
                }

             }



    }
        System.out.println("o maior valor é: " + maior);
        System.out.println("O menor valor é: "+ menor);

    }


}
