package lacoscondicaoexe;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		int cod, qtd;
		float total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		cod = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		qtd = leia.nextInt();
		leia.close();
		
		switch (cod) {
		case 1:
			total = qtd * 10.00f;
			System.out.printf("Produto: Cachorro Quente \nValor total: R$%.2f", total);
			break;
		case 2:
			total = qtd * 15.00f;
			System.out.printf("Produto: X-Salada \nValor total: R$%.2f", total);
			break;
		case 3:
			total = qtd * 18.00f;
			System.out.printf("Produto: X-Bacon \nValor total: R$%.2f", total);
			break;
		case 4:
			total = qtd * 12.00f;
			System.out.printf("Produto: Bauru \nValor total: R$%.2f", total);
			break;
		case 5:
			total = qtd * 8.00f;
			System.out.printf("Produto: Refrigerante \nValor total: R$%.2f", total);
			break;
		case 6:
			total = qtd * 13.00f;
			System.out.printf("Produto: Suco de laranja \nValor total: R$%.2f", total);
			break;
		default:
			System.out.println("Código inválido!");
		}
		
	}

}
