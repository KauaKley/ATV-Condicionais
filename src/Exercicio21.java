import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros vendidos");
        double litroCombustivel = scan.nextDouble();
        System.out.println("Digite o tipo de combustivel, A = alcool ou G = gasolina: ");
        String tipoCombustivel = scan.next();
        double valorAlcool = litroCombustivel * 1.90, valorGasolina = litroCombustivel * 2.50;
        double desconto = valorAlcool;
        double valorTotal = 0;

        if (tipoCombustivel.equalsIgnoreCase("A"))
        {
            if (litroCombustivel <= 20)
            {
                desconto = (3*valorAlcool) / 100;
                valorTotal = valorAlcool - desconto;
            }
            else if (litroCombustivel > 20)
            {
                desconto = (5*valorAlcool) / 100;
                valorTotal = valorAlcool - desconto;
            }
        }

        if (tipoCombustivel.equalsIgnoreCase("G"))
        {
            if (litroCombustivel <= 20)
            {
                desconto = (4*valorGasolina) / 100;
                valorTotal = valorGasolina - desconto;
            }
            else if (litroCombustivel > 20)
            {
                desconto = (6*valorAlcool) / 100;
                valorTotal = valorGasolina - desconto;
            }
        }
        System.out.println("O valor a ser pago é R$ " + valorTotal );
        System.out.println("O valor de desconto é R$ " + desconto);
    }
}
