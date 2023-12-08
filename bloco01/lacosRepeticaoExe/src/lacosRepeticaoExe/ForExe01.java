package lacosRepeticaoExe;

import java.util.Scanner;

public class ForExe01 {

	public static void main(String[] args) {
		
		int num1, num2, i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("DIgite o segundo núemro:");
		num2 = leia.nextInt();
		leia.close();
		
		if(num1 < num2) {
			for(i = num1; i <= num2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("O intervalo digitado é inválido!");
		}

	}

}
