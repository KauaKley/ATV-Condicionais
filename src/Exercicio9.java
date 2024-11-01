import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os 3 números: ");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double numero3 = scan.nextDouble();

        if (numero1 > numero2 && numero2 > numero3)
        {
            System.out.println("A ordem dos números em ordem decrescente é: " + numero1 + ", " + numero2 + " e " + numero3);
        }
        else if (numero1 > numero3 && numero3 > numero2)
        {
            System.out.println("A ordem dos números em ordem decrescente é: " + numero1 + ", " + numero3 + " e " + numero2);
        }
        else if (numero2 > numero1 && numero1 > numero3)
        {
            System.out.println("A ordem dos números em ordem decrescente é: " + numero2 + ", " + numero1 + " e " + numero3);
        }
        else if (numero2 > numero3 && numero3 > numero1)
        {
            System.out.println("A ordem dos números em ordem decrescente é: " + numero2 + ", " + numero3 + " e " + numero1);
        }
        else if (numero3 > numero1 && numero1 > numero2)
        {
            System.out.println("A ordem dos números em ordem decrescente é: " + numero3 + ", " + numero1 + " e " + numero2);
        }
        else if (numero3 > numero2 && numero2 > numero1)
        {
            System.out.println("A ordem dos números em ordem decrescente é: " + numero3 + ", " + numero2 + " e " + numero1);
        }
    }
}
