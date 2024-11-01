import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os 3 valores");
        double valorA = scan.nextDouble();
        double valorB = scan.nextDouble();
        double valorC = scan.nextDouble();
        double delta = (valorB*valorB) - (4*valorA*valorC);

        if (valorA ==0)
        {
            System.out.println("Não é uma equação de segundo grau");
        }
        else{
            System.out.println("O delta é: " + delta);
        }

        if (delta < 0)
        {
            System.out.println("Delta negativo");
        }
        else {
            double x1 = ((-valorB) + Math.sqrt(delta))/(2*valorA);
            double x2 = ((-valorB) - Math.sqrt(delta))/(2*valorA);

            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        }
    }
}
