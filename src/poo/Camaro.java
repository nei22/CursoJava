package poo;

public class Camaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro camaro = new Carro();
		camaro.ano = 2012;
		camaro.cor = "Amarelo";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		camaro.ligar();
		camaro.acelerar();
	}

}
