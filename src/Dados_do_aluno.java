import java.util.Scanner;

public class Dados_do_aluno {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        //entrada

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua nota: ");
        float nota = scanner.nextFloat();


        //saída

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);























    }
}
