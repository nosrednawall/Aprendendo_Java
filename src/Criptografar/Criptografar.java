package Criptografar;

import java.util.Scanner; //import classe Scanner

public class Criptografar {
	
	public char[] Criptografar() {
		int Qtda = 4; //variavel responsável por limitar a qtda de numeros ou palavras.
		boolean sair = false; //variavel feita para sair do loop
		char [] palavras = new char[Qtda]; //array variavel que irá alojar as letras
		Integer [] numero = new Integer[Qtda]; //array de numeros para alojar os números digitados
		Scanner leitor = new Scanner(System.in); //classe scanner para ler o teclado
		while(sair ==  false) { //loop
			System.out.print("\n Informe qual o número"
					+ " que deseja encriptografar \n"		
					+ "com o limite de até 4 numeros\n");		//interação com o usuário
			for(int i = 0; i < numero.length; i++) { // loop para ler e preencher a quandidade de palavras e letras
				numero[i] = leitor.nextInt(); //lendo os numeros digitados e salvando no array de números
				System.out.println("O número digitado foi: "+numero[i]); //exibe numero digitado
				palavras[i] = Encryp(numero[i]); //efetua o encriptamento e salva no array de letras
				System.out.println("A letra gerada foi: "+palavras[i]); //interação, exibe a letra gerada
				
				if(i == numero.length -1) { //condicional para sair ao terminar o looṕ
					sair = true;
				}			
				
			}//close for
		} // close while sair = true
		System.out.print("\n A sequência de letras gerada foi: \n "); //interacao
		for (int i = 0; i < palavras.length; i++) { //loop para mostrar as letras geradas
			System.out.print(" "+palavras[i]+" ");
		}
		System.out.println("");
		for (int i = 0; i < numero.length; i++) { //loop para mostrar os numeros digitados
			System.out.print(" "+numero[i]+" ");
		}
		 return palavras;
	} //close Criptografar
	
	private char Encryp(int numero) { //inicio da classe Encryp
		boolean sair = false; //condicional para sair do loop principal
		char letra = ' '; //variável que será enviada no return
		String alfabeto = "abcdefghijklmnopqrstuvwxyzabcdefg"; //alfabeto com 33 letras, pois pretendo utilizar a raiz quadrada de até 999 = 31,6069612585582
		float raiz = (float) Math.sqrt(numero); //retorna o valor da raiz do numero informado
		int i=0; //inicia o loop no zero
		while(sair == false) {	//loop
			if(raiz <= i) { //condição para sair do looṕ
				letra = alfabeto.charAt(i); //atribui a variavel letra a letra correspondente dentro do array
				sair = true;
			} //close if
			i++;
		} //close while
		return letra; //retorna a função principal
	} //close private Encryp
} // close class