import java.util.Scanner;

public class Exercicio7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite 3 numeros");
            double numero1 = scan.nextDouble();
            double numero2 = scan.nextDouble();
            double numero3 = scan.nextDouble();

            if (numero1 == numero2 && numero2 == numero3)
            {
                System.out.println("Todos os números tem o mesmo valor");
                return;
            }

            if (numero1 == numero2 || numero2 == numero3 || numero3 == numero1)
            {
                System.out.println("Dois números são iguais, todos os valores precisam ser diferentes");
            }
             else if (numero1 >= numero2 && numero1 >= numero3)
            {
                System.out.println("O primeiro número é o maior: "+numero1);
            }
            else if (numero2 >= numero1 && numero2 >= numero3)
            {
                System.out.println("O segundo número é o maior: "+numero2);
            }
            else if (numero3 >= numero1 && numero3 >= numero2)
            {
                System.out.println("O terceiro número é o maior: "+numero3);
            }

            if (numero1 <= numero2 && numero1 <= numero3)
            {
                System.out.println("O primeiro número é o menor: "+numero1);
            }
            else if (numero2 <= numero1 && numero2 <= numero3)
            {
                System.out.println("O segundo número é o menor: "+numero2);
            }
            else if (numero3 <= numero1 && numero3 <= numero2)
            {
                System.out.println("O terceiro número é o menor: "+numero3);
            }
        }
    }


