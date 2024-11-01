import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores dos 3 produtos: ");
        double produto1 = scan.nextDouble();
        double produto2 = scan.nextDouble();
        double produto3 = scan.nextDouble();

        if (produto1 == produto2 && produto2 == produto3)
        {
            System.out.println("Todos têm o mesmo valor");
            return;
        }

        if (produto1 < produto2 && produto1 < produto3)
        {
            System.out.println("O produto número 1 deve ser o escolhido, o valor é R$ " + produto1);
        }
        else if (produto2 < produto1 && produto2 < produto3)
        {
            System.out.println("O produto número 2 deve ser o escolhido, o valor é R$ " + produto2);
        }
        else if (produto3 < produto1 && produto3 < produto2)
        {
            System.out.println("O produto número 3 deve ser o escolhido, o valor é R$ " + produto3);
        }
        else if (produto1 == produto2)
        {
            System.out.println("Os produtos 1 ou 2 deve ser escolhido, o valor é R$ " + produto1);
        }
        else if (produto2 == produto3)
        {
            System.out.println("Os produtos 2 ou 3 deve ser escolhido, o valor é R$ " + produto2);
        }
        else if (produto3 == produto1)
        {
            System.out.println("Os produtos 1 ou 3 deve ser escolhido, o valor é R$ " + produto1);
        }
    }
}
