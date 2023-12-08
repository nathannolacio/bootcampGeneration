package lacosRepeticaoExe;

import java.util.Scanner;

public class DoWhileExe01 {

	public static void main(String[] args) {
		
		int num, soma = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num != 0) {
				soma += num;
			}
		} while(num != 0);
		
		leia.close();
		System.out.println("A soma dos números positivos é: " + soma);
	}

}
