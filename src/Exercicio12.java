import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da hora e a quantidade de horas trabalhadas: ");
        double valorHora = scan.nextDouble();
        double quantidadeHoras = scan.nextDouble();
        double salarioBruto = valorHora*quantidadeHoras;
        double percentualIr = 0;
        if (salarioBruto <= 900)
        {
            percentualIr = 0;
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500)
        {
            percentualIr = 5;
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500)
        {
            percentualIr = 10;
        }
        else if (salarioBruto > 2500)
        {
            percentualIr = 20;
        }
        double ir = (salarioBruto/100) * percentualIr;
        double inss = (salarioBruto/100) * 10;
        double fgts = (salarioBruto/100) * 11;
        double descontos = ir + inss;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário bruto R$ " + salarioBruto);
        System.out.println("IR R$ " + ir);
        System.out.println("INSS(10%) R$ " + inss);
        System.out.println("FGTS(11%) R$ " + fgts);
        System.out.println("Salário líquido R$ " + salarioLiquido);
    }
}
