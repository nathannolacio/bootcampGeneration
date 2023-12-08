package lacosRepeticaoExe;

import java.util.Scanner;

public class DoWhileExe02 {

	public static void main(String[] args) {
		
		int num, soma = 0, qtd = 0, media;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num != 0 && num % 3 == 0) {
				soma += num;
				qtd++;
			}
		} while(num != 0);
		
		leia.close();
		media = soma/qtd;
		System.out.println("A media dos números que são múltiplos de 3 é: " + media);

	}

}
