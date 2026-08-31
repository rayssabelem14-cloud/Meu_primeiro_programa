import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Data_de_nascimento {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia de nascimento:");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês de nascimento:");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int ano = scanner.nextInt();

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        int idade = Period.between(nascimento, hoje).getYears();

        System.out.println("Sua idade é: " + idade);

        Period.between(nascimento, hoje).getYears();

    }
}