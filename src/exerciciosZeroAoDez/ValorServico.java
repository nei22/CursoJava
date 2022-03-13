package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		// Vari�veis
		double hora, remuneracao, custo, cargaHoraria;
		// Objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("C�lculo do valor da hora do servi�o.");
		System.out.println("=========================================");
		System.out.print("Remunera��o mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		// Sa�da
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();
		
	}
}
