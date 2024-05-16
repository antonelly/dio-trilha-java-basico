import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n\nBEM VINDO AO CONTADOR\n");
		System.out.println("Informe o primeiro número:");
		int primeiroNumero = entrada.nextInt();
		System.out.println("Informe o segundo número:");
		int segundoNumero = entrada.nextInt();
		
		try {
			contar(primeiroNumero, segundoNumero);
		}
		catch(ParametrosInvalidosException excecao) {
			System.out.println("O primeiro valor deve ser menor que o segundo valor.");
		}
	}
	
	public static void contar(int inicio, int fim) throws ParametrosInvalidosException {
		if(inicio > fim) {
			throw new ParametrosInvalidosException();
		}
		else {
			int contagem = fim - inicio;
			for(int numero = 0; numero <= contagem; numero++) {
				System.out.println("Imprimindo o número " + numero + "\n");
			}
		}
	}
	
}
