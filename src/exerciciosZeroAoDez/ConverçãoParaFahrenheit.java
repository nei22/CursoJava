package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverçãoParaFahrenheit {

	public static void main(String[] args) {
		// variáveis
		double c,f;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
	    System.out.println("Conversão de temperatura!");
	    System.out.println("Digite uma temperatura em Fahrenheit: ");
	    f = teclado.nextDouble();
	    // Processamento
	    c = (5 * (f - 32)) / 9;
	    //Saida
	    System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C");
	    teclado.close();
	
	}

}
