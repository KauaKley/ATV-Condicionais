import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: ");
        double salarioAntigo = scan.nextDouble();
        double reajuste;
        int porcentagem;

        if (salarioAntigo <= 280)
        {
            double salarioAtual = salarioAntigo*20/100 + salarioAntigo;
            reajuste = salarioAntigo*20/100;
            porcentagem = 20;
            System.out.println("O salário antes do reajuste é: R$ " + salarioAntigo);
            System.out.println("A porcentagem de aumento é " + porcentagem +"%");
            System.out.println("O reajuste é: R$ " + reajuste);
            System.out.println("O salário atual do colaborador agora é: R$ " + salarioAtual);
        }
        else if (salarioAntigo > 280 && salarioAntigo <= 700)
        {
            double salarioAtual = salarioAntigo*15/100 + salarioAntigo;
            reajuste = salarioAntigo*15/100;
            porcentagem = 15;
            System.out.println("O salário antes do reajuste é: R$ " + salarioAntigo);
            System.out.println("A porcentagem de aumento é " + porcentagem +"%");
            System.out.println("O reajuste é: R$ " + reajuste);
            System.out.println("O salário atual do colaborador agora é: R$ " + salarioAtual);
        }
        else if (salarioAntigo > 700 && salarioAntigo <= 1500)
        {
            double salarioAtual = salarioAntigo*10/100 + salarioAntigo;
            reajuste = salarioAntigo*10/100;
            porcentagem = 10;
            System.out.println("O salário antes do reajuste é: R$ " + salarioAntigo);
            System.out.println("A porcentagem de aumento é " + porcentagem +"%");
            System.out.println("O reajuste é: R$ " + reajuste);
            System.out.println("O salário atual do colaborador agora é: R$ " + salarioAtual);
        }
        else if (salarioAntigo > 1500)
        {
            double salarioAtual = salarioAntigo*5/100 + salarioAntigo;
            reajuste = salarioAntigo*5/100;
            porcentagem = 5;
            System.out.println("O salário antes do reajuste é: R$ " + salarioAntigo);
            System.out.println("A porcentagem de aumento é " + porcentagem +"%");
            System.out.println("O reajuste é: R$ " + reajuste);
            System.out.println("O salário atual do colaborador agora é: R$ " + salarioAtual);
        }
    }
}
