package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// variáveis
		double alcool, gasolina;
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("Álcool x Gasolina");
		System.out.print("Álcool valor: ");
		alcool = teclado.nextDouble();
		System.out.print("Gasolina valor: ");
		gasolina = teclado.nextDouble();
		// Processamento e saída
		if (alcool < gasolina * 0.7) {
			System.out.println("Vá de álcool!");
		} else {
			System.out.println("Vá de gasolina!");
		}
		teclado.close();
	}

}
