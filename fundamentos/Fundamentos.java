package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		// Variáveis
		String nome = "Ednei Louback";
		int idade = 13;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arcondicionado = true;
		
		
		
		
		//MOSTRANDO NO CONSOLE
		System.out.println("--------------------------------------------");
		System.out.println("USO DE VARI�VEIS NO JAVA");
		System.out.println("--------------------------------------------");
		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arcondicionado);
		System.out.println("--------------------------------------------");
		System.out.println("");
		
		//Variáveis
		double i = 10;
		System.out.println("--------------------------------------------");
		System.out.println("USO DE VARI�VEIS NO JAVA");
		System.out.println("--------------------------------------------");
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("i =+ 5           | i = " + (i += 5));
		System.out.println("i =- 5           | i = " + (i -= 5));
		System.out.println("i =* 5           | i = " + (i *= 5));
		System.out.println("i =/ 5           | i = " + (i /= 5));
		System.out.println("");
		System.out.println("--------------------------------------------");
		i++;
		System.out.println("i++ =            | i = " + i);
		i--;
		System.out.println("i-- =            | i = " + i);
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo #1: Uso do 'if':");
		System.out.println("Se for 'if' sexo Masculino e Se for 'else' Sexo Feminino!");
		// COMBASE NO SEXO ACIMA
		// Se eu alterar a vari�vel, 
		// a condi��o muda e o print tamb�m!
		//sexo =  'F';
		if(sexo == 'M') {
			System.out.println("Nesse caso a vari�vel com 'F' esta comentada.");
			System.out.println("Imprimindo: 'Masculino'");
		}else {
			System.out.println("Nesse caso a vari�vel com 'F' foi descomentada.");
			System.out.println("Imprimindo: 'Feminino'");
		}
		//Manupuladoir de idade
		System.out.println("");
		System.out.println("Exemplo #2: Uso do 'else-if':");
		System.out.println("Aqui cabem tres condi��es,\nsendo que a �ltima est� impl�cita e 'Setada'.");
		// COMBASE NO SEXO ACIMA
		// idade = 16;
		
		if(idade < 16) {
			System.out.println("Pro�bido votar!");
		}else if (idade >= 18 && idade <= 70){
			System.out.println("Voto Obrigat�rio!");
		}else {
			System.out.println("Voto facultativo!");
		}
		
		System.out.println("");
		System.out.println("Exemplo #3: Uso do 'Switch-case':");
		System.out.println("Aqui cabem tres condi��es,\nMAS VEM JUNTO O 'DEFAULT'.");
		// COMBASE NO N�MERO ABAIXO
		int iwq = 4;
		switch (iwq){
		case 1:
			// c�digo da vari�vel 1 CLIENTE
			System.out.println("Cliente!");
			break;
		case 2:
			// c�digo da vari�vel 2 USU�RIO
			System.out.println("Usu�rio!");
			break;
		case 3:
			// c�digo da vari�vel 2 USU�RIO
			System.out.println("Relat�rio");
			break;
		default:	// c�digo da vari�vel 3
			System.out.println("Op��o inv�lida!");
			break;
		}
		System.out.println("");
		System.out.println("Exemplo #4: Uso do 'for':");
		System.out.println("Aqui a estrutura forma \num la�o de repeti��o!");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("Exemplo #5: TABUADA");
		System.out.println("Estrutura de repati��o \ndentro de estrutura de repeti��o");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			System.out.println("------------------------------------------------");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + "  = " + valor * tabuada  );
			}
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("Exemplo #6: Estrutura 'while'");
		System.out.println("Estruturas de repati��o.");
		int contador = 1;
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("Exemplo #7: Estrutura 'do while'");
		System.out.println("Estruturas de repati��o.");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente? (s/n)");
			novoJogo = 'n';
		}while(novoJogo == 's'); {
			System.out.println("Game over!");			
		}
		
		
	}

}
