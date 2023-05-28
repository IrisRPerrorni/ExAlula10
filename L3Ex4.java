import java.util.Scanner;

public class L3Ex4 {
    //Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores
    // e lhe contrataram para desenvolver o programa que calcula os reajustes.
    // Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
    // baseado no salário atual:
    //Salários até R$ 280,00 (incluindo), receberão aumento de 20%
    //Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
    //Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
    //Salários de R$ 1500,00 em diante, receberão aumento de 5%
    //Após o aumento ser realizado, informe na tela:
    //O salário antes do reajuste;
   //O percentual de aumento aplicado;
   //O valor do aumento;
   // O novo salário, após o aumento;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salario do colaborador: ");
        double sal = entrada.nextDouble();
        System.out.print("------------Folha de pagamento ------------------ ");

        if( sal<= 280){
            System.out.printf("\nSalario do colaborador antes do reajuste R$ %.2f: " , sal);
            System.out.println("\nO valor do reajuste é 20% ");
            double valor = sal * 0.2;
            System.out.printf("Aumento de R$: %.2f: " , valor);
            double tsal = valor + sal;
            System.out.printf("\nSalário após o reajuste R$: %.2f " , tsal);

        } else if(sal > 280 && sal <= 700){
            System.out.printf("\nSalario do colaborador antes do reajuste R$ %.2f: " , sal);
            System.out.println("\nO valor do reajuste é 15% ");
            double valor = sal * 0.15;
            System.out.printf("Aumento de R$: %.2f: " , valor);
            double tsal = valor + sal;
            System.out.printf("\nSalário após o reajuste R$: %.2f " , tsal);

        }else if(sal > 700 && sal <= 1500){
            System.out.printf("\nSalario do colaborador antes do reajuste R$ %.2f: " , sal);
            System.out.println("\nO valor do reajuste é 10% ");
            double valor = sal * 0.10;
            System.out.printf("Aumento de R$: %.2f: " , valor);
            double tsal = valor + sal;
            System.out.printf("\nSalário após o reajuste R$: %.2f " , tsal);

        }else if(sal>1500){
            System.out.printf("\nSalario do colaborador antes do reajuste R$ %.2f: " , sal);
            System.out.println("\nO valor do reajuste é 5% ");
            double valor = sal * 0.05;
            System.out.printf("Aumento de R$: %.2f: " , valor);
            double tsal = valor + sal;
            System.out.printf("\nSalário após o reajuste R$: %.2f " , tsal);
        }
    }

}
