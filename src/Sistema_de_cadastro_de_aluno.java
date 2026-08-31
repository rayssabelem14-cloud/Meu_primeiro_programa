import java.util.Scanner;

public class Sistema_de_cadastro_de_aluno {
    public static void main (String... args) {

                Scanner scanner = new Scanner(System.in);

                // Entrada de dados
                System.out.println("Digite seu nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite sua idade:");
                int idade = scanner.nextInt();

                System.out.println("Digite seu ano de nascimento:");
                int anoNascimento = scanner.nextInt();

                // Limpa o buffer do Scanner
                scanner.nextLine();

                System.out.println("Digite seu curso:");
                String curso = scanner.nextLine();

                System.out.println("Digite sua nota:");
                double nota = scanner.nextDouble();

                // Relatório
                System.out.println("\n===== RELATÓRIO DO ALUNO =====");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Ano de nascimento: " + anoNascimento);
                System.out.println("Curso: " + curso);
                System.out.println("Nota: " + nota);

                scanner.close();
            }
        }

























