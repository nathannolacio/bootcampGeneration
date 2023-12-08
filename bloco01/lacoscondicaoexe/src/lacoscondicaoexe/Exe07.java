package lacoscondicaoexe;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		float n1, n2, total;
		int codOperacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();

		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();

		System.out
				.println("\nDigite o código da operação: " + "\n1- Soma \n2- Subtração \n3- Multiplicação \n4- Divisão");
		codOperacao = leia.nextInt();
		leia.close();

		switch (codOperacao) {
		case 1:
			total = n1 + n2;
			System.out.printf(n1 + " + " + n2 + " = " + total);
			break;
		case 2:
			total = n1 - n2;
			System.out.printf(n1 + " - " + n2 + " = " + total);
			break;
		case 3:
			total = n1 * n2;
			System.out.printf(n1 + " * " + n2 + " = " + total);
			break;
		case 4:
			total = n1 / n2;
			System.out.printf(n1 + " / " + n2 + " = " + total);
			break;
		}

	}

}
