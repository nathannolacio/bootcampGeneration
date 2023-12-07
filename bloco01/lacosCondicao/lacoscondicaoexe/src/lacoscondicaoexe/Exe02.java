package lacoscondicaoexe;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		leia.close();
				
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero +  " é par e positivo");
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo");
		} else if(numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é ímpar e positvo");
		} else if(numero % 2 != 0 && numero < 0) {
			System.out.println("O número " + numero + " é ímpar negativo");
		} else {
			System.out.println("O número " + numero + " é neutro");
		}
	}

}
