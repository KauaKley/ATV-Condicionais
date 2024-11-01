import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        double numero1, numero2;
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();

        if(numero1>numero2)
        {
            System.out.println("O numero 1 é maior: "+ numero1);
        }
        else
        {
            System.out.println("O numero 2 é maior: "+ numero2);
        }
    }
}