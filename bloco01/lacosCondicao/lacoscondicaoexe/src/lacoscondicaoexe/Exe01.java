package lacoscondicaoexe;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		int valorA, valorB, valorC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		valorC = leia.nextInt();
		leia.close();
		
		if((valorA + valorB) > valorC) {
			System.out.println("A soma de A + B é maior do que C");
		}
		
		if((valorA + valorB) < valorC) {
			System.out.println("A soma de A + B é menor do que C");
		}
		
		if((valorA + valorB) == valorC) {
			System.out.println("A soma de A + B é igual a C");
		}
	}

}
