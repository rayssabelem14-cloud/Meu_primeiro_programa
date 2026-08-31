import java.util.Scanner;

public class Funcionario {
    public static void main(String... args) {
        String nome = "Rayssa";
        int idade = 19;
        double salario = 3000.00;
        String sexo = "Feminino";

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite 1 para Ativo ou 2 para Inativo:");
            int x = sc.nextInt();

            String status;

            if (x == 1) {
                status = "Ativo";
            } else if (x == 2) {
                status = "Inativo";
            } else {
                status = "Status inválido";
            }


            System.out.println("\n--- Dados do Funcionario ---");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salario: " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Status: " + status);


        }
    }

}











