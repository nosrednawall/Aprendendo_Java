package Fibonacci;

import java.util.Scanner;

public class SequenciaFibonacci {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Informe quantas sequencias de Fibonacci deseja visualizar");
		Scanner leitor = new Scanner(System.in);
		boolean sair = false;
		
		while(sair == false) {
			try {
				int	limite= leitor.nextInt();
				GetFibonacci(limite);
			} catch (Exception e) {
				System.out.println("Valor incorreto, "
						+ "por favor insira um valor válido");
			} finally {
				sair = true;
			}
		}
	}

	public static void GetFibonacci(int limite) {
		int numero1 =0, numero2 = 1, fibonacci = 0;
		
		System.out.println("Squencia de Fibonacci");
		for(int i = 0; i < limite; i++) {
			fibonacci = numero1 + numero2;
			System.out.println("A sequencia é: "+numero1 + " + " + numero2 + " = " + fibonacci);
			numero1 = numero2;
			numero2 = fibonacci;
		}
	}
}
