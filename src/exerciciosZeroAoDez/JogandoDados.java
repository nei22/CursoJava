package exerciciosZeroAoDez;

import java.util.Scanner;

public class JogandoDados {

	public static void main(String[] args) {
		// Vari�veis
		char opcao = 's';
		Scanner teclado = new Scanner(System.in);
		while (opcao == 's') {
			System.out.println("==========================================");
			System.out.println("");
			System.out.println("=====================");
			System.out.println("Lan�ando DADO....");
			int dado = (int) (Math.random() * 3 + 1);
			System.out.println("LADO " + dado + " PARA CIMA!!!!");
			System.out.println("");
			System.out.println("==========================================");
			System.out.print("Deseja lan�ar o dado novamente (s/n?):");
			System.out.println("");
			System.out.println("==========================================");
			opcao = teclado.next().charAt(0);
			
		}

	}

}
