import java.util.Scanner;

public class Ano_de_nascimento {
    private static int Ano_de_nascimento;

    public static void main (String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?: ");
        String nome = scanner.nextLine();

        System.out.println("Qual seu ano de nascimento?: ");
        int Ano_de_Nascimento = scanner.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - Ano_de_Nascimento;

        System.out.println("Você tem " + idade + " anos! ");

        scanner.close();










    }






}
