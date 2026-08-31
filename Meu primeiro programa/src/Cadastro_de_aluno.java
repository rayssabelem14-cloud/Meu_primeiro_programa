import java.util.Scanner;

public class Cadastro_de_aluno {
    public static void main (String... args) {

        Scanner scanner = new Scanner(System.in);

        //entrada

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua matricula: ");
        int matricula = scanner.nextInt();

        scanner.nextLine(); // limpa o Enter que ficou no Scanner

        System.out.println("Digite seu curso: ");
        String curso = scanner.nextLine();

        //saída

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);






















    }






}
