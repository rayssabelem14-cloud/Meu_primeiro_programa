import java.time.LocalDate;
import java.util.Scanner;

public class Ano_atual {
    public static void main (String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu ano de nascimento?: ");
        int Ano_de_Nascimento = scanner.nextInt();

        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();

        int idade = anoAtual - Ano_de_Nascimento;

        System.out.println("Você tem " + idade + " anos.");





















    }
}
