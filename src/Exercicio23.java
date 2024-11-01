import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga o tipo de carne: (1)Filé duplo  (2)Alcatra  (3)Picanha");
        int tipoCarne = scan.nextInt();

        System.out.println("Diga quantidade que quer em kg:");
        double quantidadeCarne = scan.nextDouble();
        double fileDuploValor;
        double alcatraValor;
        double picanhaValor;
        double valorPagar = 0;
        double valorPagarDesconto = 0;

        System.out.println("Método de pagamento: Dinheiro, Pix ou Cartão: ");
        String metodoPagamento = scan.next();
        double desconto = 0;

        switch (tipoCarne)
        {
            case 1:
                if (quantidadeCarne <= 5)
                {
                    fileDuploValor = 4.90;
                    valorPagar = quantidadeCarne * fileDuploValor;
                }
                else
                {
                    fileDuploValor = 5.80;
                    valorPagar = quantidadeCarne * fileDuploValor;
                }
                break;
            case 2:
                if (quantidadeCarne <= 5)
                {
                    alcatraValor = 5.90;
                    valorPagar = quantidadeCarne * alcatraValor;
                }
                else
                {
                    alcatraValor = 6.80;
                    valorPagar = quantidadeCarne * alcatraValor;
                }
                break;
            case 3:
                if (quantidadeCarne <= 5)
                {
                    picanhaValor = 6.90;
                    valorPagar = quantidadeCarne * picanhaValor;
                }
                else
                {
                    picanhaValor = 7.80;
                    valorPagar = quantidadeCarne * picanhaValor;
                }
                break;
            default:
                System.out.println("Opção inexistente");
        }

            if (metodoPagamento.equalsIgnoreCase("Dinheiro"))
            {
                metodoPagamento = "Dinheiro";
            } else if (metodoPagamento.equalsIgnoreCase("Pix"))
            {
                metodoPagamento = "Pix";
            }
            else if (metodoPagamento.equalsIgnoreCase("Cartão"))
            {
                metodoPagamento = "Cartão";
                desconto = (valorPagar * 5) / 100;
                valorPagarDesconto = valorPagar - desconto;
            }
            else
            {
                System.out.println("Opção inexistente");
            }

        System.out.println("O tipo da carne é: " + tipoCarne);
        System.out.println("A quantidade de carne é: " + quantidadeCarne);
        System.out.println("O preço total é: " + valorPagar);
        System.out.println("O tipo de pagamento é: " + metodoPagamento );
        System.out.println("O valor do desconto é: " + desconto );
        System.out.println("O valor a ser pago é: " + valorPagarDesconto);
    }
}
