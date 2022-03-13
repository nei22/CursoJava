package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		// Variáveis
		double hora, remuneracao, custo, cargaHoraria;
		// Objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("Cálculo do valor da hora do serviço.");
		System.out.println("=========================================");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga horária mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		// Saída
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();
		
	}
}
