import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a letra do turno que estuda: M, V ou N para Matutino, Vespertino ou Noturno");
        String turno = scan.next();

        switch (turno)
        {
            case "M": System.out.println("Bom dia!");
            break;
            case "V": System.out.println("Boa tarde!");
            break;
            case "N": System.out.println("Boa noite!");
            break;
            case "m": System.out.println("Bom dia!");
            break;
            case "v": System.out.println("Boa tarde!");
            break;
            case "n": System.out.println("Boa noite!");
            break;
            default: System.out.println("Valor inválido!");
        }
    }
}
