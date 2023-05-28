public class L2Ex8 {
    //Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

    public static void main(String[] args){
        int soma = 0;
        System.out.println(" Os numeros impares são: ");
        for(int i = 0 ; i <= 50; i++){
            if ( i % 2 != 0){
                soma+= i ;
                System.out.println( i );
            }
        }
        System.out.print( "o valor da soma: "+ soma);

    }
}
