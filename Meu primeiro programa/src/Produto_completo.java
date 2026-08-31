import java.util.Scanner;

public class Produto_completo {
    public static void main(String... args) {

        String nome = "Celular";
        String codigo = "CEL123";
        int quantidade = 50;
        double preco = 2500.00;
        String categoria = "Eletronicos";

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite 1 para Disponível ou 2 para Esgotado:");
            int x = sc.nextInt();

            String status;

            if (x == 1) {
                status = "Disponível";
            } else if (x == 2) {
                status = "Esgotado";
            } else {
                status = "Opção inválida";
            }

            System.out.println("\n--- Dados do Produto ---");
            System.out.println("Nome: " + nome);
            System.out.println("Codigo: " + codigo);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preco: " + preco);
            System.out.println("Categoria: " + categoria);
            System.out.println("Status: " + status);
        }
    }
}


























