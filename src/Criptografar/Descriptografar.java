package Criptografar;

import java.util.Scanner;

public class Descriptografar {

	public Descriptografar() {
		
		boolean sair = false; //condicao para sair do loop
		int [] numero=null; //variável que armazenará o código descriptografado
		int i=0; // loop
		
		Scanner leitor = new Scanner(System.in); //funcao para ler teclado
		System.out.println("Informe o código que deseja descriptografar: "); //interacao
		String codigo = leitor.next(); //leitura do teclado
		
		while(sair == false) { //loop
			if(i == codigo.length() -1) {
				sair = true;
			}else {
				numero[i]=codigo.charAt(i); //chama a funcao que efetua a descriptacao
				i++;
			}
		}
	}
	
	//faltou um escopo
	
	public int Descryp(char letra) {
		int numero = 0;
		boolean sair = false;
		String alfabeto = "abcdefghijklmnopqrstuvwxyzabcdefg";
		
		int i=0;
		while(sair == false) {
			
		}
		return numero;
	}

}
