import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        // Tem que criar um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("\nOla, meu nome é " + nome + " " + sobrenome + ", tenho " + idade + " anos de idade, " + altura + " de altura e peso " + peso + " Kg.\n");
    }
}
