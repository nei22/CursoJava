package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// vari�veis
		double alcool, gasolina;
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("�lcool x Gasolina");
		System.out.print("�lcool valor: ");
		alcool = teclado.nextDouble();
		System.out.print("Gasolina valor: ");
		gasolina = teclado.nextDouble();
		// Processamento e sa�da
		if (alcool < gasolina * 0.7) {
			System.out.println("V� de �lcool!");
		} else {
			System.out.println("V� de gasolina!");
		}
		teclado.close();
	}

}
