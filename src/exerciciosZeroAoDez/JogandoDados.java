package exerciciosZeroAoDez;

import java.util.Scanner;

public class JogandoDados {

	public static void main(String[] args) {
		// Variáveis
		char opcao = 's';
		Scanner teclado = new Scanner(System.in);
		while (opcao == 's') {
			System.out.println("==========================================");
			System.out.println("");
			System.out.println("=====================");
			System.out.println("Lançando DADO....");
			int dado = (int) (Math.random() * 3 + 1);
			System.out.println("LADO " + dado + " PARA CIMA!!!!");
			System.out.println("");
			System.out.println("==========================================");
			System.out.print("Deseja lançar o dado novamente (s/n?):");
			System.out.println("");
			System.out.println("==========================================");
			opcao = teclado.next().charAt(0);
			
		}

	}

}
