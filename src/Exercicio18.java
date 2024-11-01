import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0)
        {
            System.out.println("O número é PAR");
        }
        else
        {
            System.out.println("O número IMPAR");
        }
    }
}
