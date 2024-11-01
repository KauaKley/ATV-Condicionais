import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos quilos de morangos e quantos quilos de maçã vai querer: ");
        double morangoKg = scan.nextDouble();
        double macaKg = scan.nextDouble();
        
        double valorMorango = 0;
        if (morangoKg <= 5)
        {
            valorMorango = 2.50;
        } else
        {
            valorMorango = 2.20;
        }

        double valorMaca = 0;
        if (macaKg <= 5)
        {
            valorMaca = 1.80;
        } else
        {
            valorMaca = 1.50;
        }
        
        double valorTotalMorango = valorMorango * morangoKg;
        double valorTotalMaca = valorMaca * macaKg;
        double valorTotal = valorMorango + valorMaca;
        double desconto;
        double valorTotalDesconto = 0;


        if (morangoKg + macaKg > 8 || valorTotal > 25 )
        {
            desconto = (valorTotal * 10) / 100;
            valorTotalDesconto = valorTotal - desconto;
        }
        System.out.println("O valor a ser pago é de R$ " + valorTotalDesconto);
    }
}
