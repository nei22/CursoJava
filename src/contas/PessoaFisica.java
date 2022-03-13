package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc1 = new Conta();
		cc1.setCliente("Ednei Louback");
		cc1.setSaldo(10000);
		System.out.println("Cliente: "+ cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println("----------------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Sirley Antunes");;
		cc2.setSaldo(83000);
		System.out.println("Cliente: "+ cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(1000);
		cc2.exibirSaldo();
		System.out.println("----------------------------------");
		System.out.println("Transferência");
		System.out.println("Cliente: "+ cc1.getCliente());
		System.out.println("Favorecido: "+ cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("----------------------------------");
		System.out.println("Cliente: "+ cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("----------------------------------");
		System.out.println("Cliente: "+ cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("----------------------------------");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("O saldo total nas contas: R$ "+ relatorio);
		
		
	}

}
