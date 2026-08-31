import java.util.Scanner;

public class Compra_do_produto {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual o nome do produto?: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o preco?: ");
        double preco = scanner.nextInt();

        System.out.println("Qual a quantidade?: ");
        int quantidade = scanner.nextInt();

        System.out.println("\n--- Dados da Compra ---");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preco: " + preco);





















    }
}
