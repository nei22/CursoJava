package exerciciosZeroAoDez;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PontoDeVendas {

	public static void main(String[] args) {
		// Variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		// Objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada 1
		System.out.println("Loja Do Maciel");
		System.out.println("=======================");
		System.out.print("Valor total [R$]: ");
		total = teclado.nextDouble();
		System.out.print("Desconto [%]: ");
		desconto = teclado.nextDouble();
		// Processamento 1
		totalDesconto = total - (desconto * total) / 100;
		// Saida 1
		System.out.println("Total com desconto [R$]:" + formatador.format(totalDesconto));
		// Entrada 2
		System.out.println("=======================");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		// Processamento 2
		troco = valorPago - totalDesconto;
		// Saida 2
		System.out.println("Troco R$: " + formatador.format(troco));
		teclado.close();
		
		
		
	}

}
