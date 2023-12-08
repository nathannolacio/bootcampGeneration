package lacosRepeticaoExe;

import java.util.Scanner;

public class ForExe02 {

	public static void main(String[] args) {
		
		int num, numPar = 0, numImpar = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número:");
			num = leia.nextInt();

			if(num % 2 == 0) {
				numPar++; 
			} else if(num % 2 != 0) {
				numImpar++;
			}
		}
		leia.close();
		System.out.println("\nTotal de números pares: " + numPar +"\n"
				+ "Total de números ímpares: " + numImpar);
	}

}
