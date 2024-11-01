import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scan.next();

        if (letra.length()>1)
        {
            System.out.println("Só é permitido a escrita de apenas uma letra");
        }
        switch(letra)
        {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":System.out.println("Vogal");
            break;
            default: System.out.println("Consoante");
        }
    }
}
