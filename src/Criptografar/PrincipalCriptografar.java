package Criptografar;

import java.util.Scanner;

public class PrincipalCriptografar {

	public static void main(String[] args) {
		
		System.out.println("Criptograr e descriptografar palavras");
		
		Menu();
		int escolha = Leitor();
		switch (escolha) {
		
		case 1:
			Criptografar crypt = new Criptografar();
			crypt.Criptografar();
			break;
			
		case 2:
			Descriptografar descrypt = new Descriptografar();
			//descrypt.Descriptografar();
			break;

		default:
			break;
		}
	}
	
	public static String Menu() {
		
		System.out.print("\n Menu \n"
				+ "Selecione uma das opções: \n"
				+"\n"
				+ "Opção			Descrição \n"
				+ "1			Encriptar palavra \n"
				+ "2			Descriptar palavra	\n"
				+ "3			Sair \n");
		
		return null;
	}
	public static int Leitor() {
		int escolha;
		Scanner leitor = new Scanner(System.in);
		
		escolha = leitor.nextInt();
		
		while(escolha > 3 || escolha < 1) {
			System.out.print("\n Escolha errada! \n"
					+ "Por favor escolha entre 1 a 3\n"
					+ "1 para Encriptar \n"
					+ "2 para Descriptar e \n"
					+ "3 para sair \n");
			escolha = leitor.nextInt();
		}
		return escolha;
		
	}

}
