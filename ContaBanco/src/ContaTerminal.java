import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite o sobrenome do cliente");
        String sobrenomeCliente = scanner.next();

        double saldoConta = 100;

        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + "!\nObrigado por criar uma conta em nosso banco!\nSua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldoConta + " já está disponível para saque.\n");

    }
}
