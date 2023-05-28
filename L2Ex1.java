public class L2Ex1 {
    //Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
    // A primeira vez com "for" e a segunda com "while".
    public static void main(String[] args){
        System.out.println("Vamos contar de 1 a 100");
        for( int i=1; i<=100 ; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Vamos contar novamente de 1 a 100");
        int n = 1;
        while (n<=100){
            System.out.println(n);
            n++;
        }

    }

}
