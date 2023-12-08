package lacosRepeticao;

import java.util.Scanner;

public class ForExemplo02 {

	public static void main(String[] args) {
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Digite o " + i + "° nome:");
			nome = leia.nextLine();
			System.out.println("O " + i + "° nome é " + nome);
		}
		leia.close();
	}

}
