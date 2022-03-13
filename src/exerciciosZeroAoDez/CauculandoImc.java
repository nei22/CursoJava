package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CauculandoImc {

	public static void main(String[] args) {
		// Variáveis
		double peso, altura, imc;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.println("Cálculo do Ídice de Massa Corporal");
		// Entrada
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite seu altura: ");
		altura = teclado.nextDouble();
		// Processamento
		imc = peso / (altura * altura);
		System.out.println("Ídice de Massa Corporal: " + formatador.format(imc));
		teclado.close();

		// tabela Imc
		if (imc < 18.5) {
			System.out.println("Abaixo do peso!");
		} else if (imc <= 24.9) {
			System.out.println("Peso ideal!");
		} else if (imc <= 29.9) {
			System.out.println("Levemente acima do peso!");
		} else if (imc <= 34.9) {
			System.out.println("Obesidade 1°!");
		} else if (imc <= 39.9) {
			System.out.println("Obesidade severa!");
		}else if (imc > 40) {
		System.out.println("Obesidade MÓRBIDA!!");
	}

	}

}
