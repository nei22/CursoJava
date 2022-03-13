package exerciciosZeroAoDez;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		// Variaveis
		int jogador, computador;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("===JOOKEEENPÔ=================");
		System.out.println("");
		System.out.println("1. PEDRA");
		System.out.println("2. PAPEL");
		System.out.println("3. TESOURA");
		// Entrada		
		System.out.print("Digite a opção desejada: ");
		// LÓGICA DO JOGADOR
		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA!!!");
		}
		computador = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		// empate -> vitoria -> derrota
		if ((jogador == computador)) {
			System.out.println("EMPATOU!");
			System.out.println("");
			System.out.print("Escolha de novo: ");
			// LÓGICA DO JOGADOR
			jogador = teclado.nextInt();
			System.out.println("");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("VENCEU!");
				// 1x3 2x1 3x2
			} else {
				System.out.println("PERDEU!");
			}
		}
	}

}
