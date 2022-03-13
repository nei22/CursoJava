package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegraDeTres {

	public static void main(String[] args) {
		// Variáveis
		double x, y, valor;
		// objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("");
		System.out.println("Regra de (3)Tres");
		System.out.println("[x] porcento de [y] é igual ao [valor]");
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		System.out.print("[Digite o valor de x] ");
		x = teclado.nextDouble();
		System.out.println("");
		System.out.print("[Digite o valor de y] ");
		y = teclado.nextDouble();
		// Processamento
		valor = (x * y) / 100;
		// Saída
		System.out.println("");
		System.out.println("=========================================");
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));

		teclado.close();
	}

}
