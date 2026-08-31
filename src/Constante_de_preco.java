import java.util.Scanner;

public class Constante_de_preco {
    public static void main (String... args) {

                Scanner scanner = new Scanner(System.in);

                final double Preco_produto = 50.00;


                System.out.print("Quantos produtos você deseja comprar? ");
                int quantidade = scanner.nextInt();

                double valorTotal = Preco_produto * quantidade;

                System.out.println("O valor total da compra é: R$ " + valorTotal);

                scanner.close();
            }
        }




















