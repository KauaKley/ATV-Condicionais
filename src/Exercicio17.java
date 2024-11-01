import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero que represente um ano: ");
        int ano = scan.nextInt();

        if ( ano % 400 == 0 || ano % 4 == 0 && ano != 0  )
        {
            System.out.println("O ano é Bissexto");
        }
        else
        {
            System.out.println("O ano NÃO é Bissexto");
        }
    }
}
