import java.util.Scanner;

public class Salario_minimo {
    public static void main (String... args) {

        Scanner scanner = new Scanner(System.in);
        double Salario_minimo = 1412.00;

        System.out.print("Qual seu salario?: ");
        double salario = scanner.nextDouble();


        double diferenca = salario - Salario_minimo;

        System.out.println("A diferença é: R$ " + diferenca);


















    }
}
