package Criptografar;

import java.util.Scanner;

public class Criptografar {
	
	public char[] Criptografar() {
		boolean sair = false;
		char [] palavras = new char[4];
		Integer [] numero = new Integer[4];
		Scanner leitor = new Scanner(System.in);
		while(sair ==  false) {
			System.out.print("\n Informe qual o número"
					+ " que deseja encriptografar \n"
					+ "com o limite de até 4 numeros\n");
			for(int i = 0; i < numero.length; i++) {
				numero[i] = leitor.nextInt();
				palavras[i] = Encryp(numero[i]);
				
				if(i == numero.length -1) {
					sair = true;
				}			
				
			}//close for
		} // close while sair = true
		System.out.print("\n A sequência de letras gerada foi: \n ");
		for (int i = 0; i < palavras.length; i++) {
			System.out.print(" "+palavras[i]+" ");
		}
		 return palavras;
	} //close Criptografar
	
	private char Encryp(int numero) {
		boolean sair = false;
		char letra = ' ';
		String alfabeto = "abcdefghijklmnopqrstuvwxyzabcde"; //31 letras
		char [] letras = alfabeto.toCharArray();
		float raiz = (float) Math.sqrt(numero);
		while(sair == false) {
			for(int i = 0; i < letras.length;i++)
				if(raiz <= i) {
					letra = letras[i];
					sair = true;
				}
		}
		
		return letra;
	}

	
} // close class
