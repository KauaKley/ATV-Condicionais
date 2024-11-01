import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a letra do seu sexo");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("M"))
        {
            System.out.println("M de Masculino");
        }
        else if (sexo.equalsIgnoreCase("F"))
        {
            System.out.println("F de Feminino");
        }
        else
        {
            System.out.println("Sexo inválido");
        }
    }
}
