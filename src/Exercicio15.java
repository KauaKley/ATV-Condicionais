import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as medidas dos 3 lados: ");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1)
        {
            System.out.println("Isso não forma um triângulo");
            return;
        }

        if (lado1 == lado2 && lado2 == lado3)
        {
            System.out.println("Triângulo equilátero");
        }
        else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1)
        {
            System.out.println("Triângulo escaleno");
        }
        else
        {
            System.out.println("Triângulo isósceles");
        }
    }
}
