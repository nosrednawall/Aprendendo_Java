import java.util.Arrays;
import java.util.Scanner;

public class Ordenando {
	
	public static void main(String[] args) {
		int[] numero = new int[10];
		Scanner sc = new Scanner(System.in);
		final Integer limite = new Integer(10);
		
		System.out.println("Insira até 10 números diferentes");

		for (int i = 0; i < limite.intValue(); i++) {
			
			numero[i]=sc.nextInt();
			
			System.out.println("O numero digitado foi: "+numero[i]);
			int falta = limite.intValue() - (i+1);
			System.out.println("Ainda faltam "+falta+" numeros a serem digitados!");
			if (i==9) {
				System.out.println("Ordenando os numeros informados!");
				Arrays.sort(numero);
				System.out.println("E a sequência ficou como:");
				for (int j : numero) {
					System.out.print(" "+j+" ");
				}
				break;				
			}
		}

		
	}

}
