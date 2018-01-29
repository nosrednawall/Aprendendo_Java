package OrdenarNumeros;
import java.util.Arrays; //Classe responsável pelos arrays
import java.util.Scanner; //Classe responsável pelos arrays

public class Ordenando {
	
	public static void main(String[] args) {
		//declaracao das variáveis
		int[] numero = new int[10]; //criação do objeto array de int, com o tamanho máximo de 10
		Scanner sc = new Scanner(System.in); //criacao da do obejto scanner
		final Integer limite = new Integer(10); //criacao do objeto de controle
		
		System.out.println("Insira até 10 números diferentes"); // interação.

		for (int i = 0; i < limite.intValue(); i++) { //inicio do for.
			
			numero[i]=sc.nextInt(); //atribuição do valor digitado pelo usuário ao array
			
			System.out.println("O numero digitado foi: "+numero[i]); //interação
			int falta = limite.intValue() - (i+1); //interação
			System.out.println("Ainda faltam "+falta+" numeros a serem digitados!");//interação

			if (i==9) { //inicio do if para ordenar os numeros e sair do programa
				
				System.out.println("Ordenando os numeros informados!");//interação
				Arrays.sort(numero); //ordenando os números contidos no array.
				System.out.println("E a sequência ficou como:");//interação
				
				for (int j : numero) { //imprimindo os números
					System.out.print(" "+j+" ");
				}				
			}
		}	
	}
}