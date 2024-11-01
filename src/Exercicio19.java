import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        System.out.println("Qual operação você deseja realizar? ");
        String operador = scan.next();
        int resultado = 0;
        boolean valida = true; //flag

        switch (operador)
        {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operador indisponivel");
                valida = false;
        }
        if (valida)
        {
            System.out.println("Resultado: " + resultado);

            if (resultado % 2 == 0)
            {
                System.out.println("O número é PAR");
            }
            else
            {
                System.out.println("O número é IMPAR");
            }

            if (resultado < 0)
            {
                System.out.println("O número é NEGATIVO");
            }
            else if (resultado > 0)
            {
                System.out.println("O número é POSITIVO");
            }
            else
            {
                System.out.println("O número é NEUTRO");
            }
        }
    }
}
