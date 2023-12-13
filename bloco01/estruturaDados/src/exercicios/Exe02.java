package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;
		
		do {
			System.out.println("****** ***** **** *** ** * MENU * ** *** **** ***** ******");
			System.out.println("*                                                        *");
			System.out.println("*             1 - Adicionar livro na pilha               *");
			System.out.println("*             2 - Listar todos os livros                 *");
			System.out.println("*             3 - Retirar livro da pilha                 *");
			System.out.println("*             0 - Sair                                   *");
			System.out.println("*                                                        *");
			System.out.println("****** ***** **** *** ** * **** * ** *** **** ***** ******");

			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro que será adicionado na pilha: ");
				leia.nextLine();
				String nomeLivro = leia.nextLine();
				livros.push(nomeLivro);
				System.out.println("O livro \"" + nomeLivro + "\" foi adicionado na pilha!");
				System.out.println();
				break;

			case 2:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("\nOs livros da pilha são: ");
					for (String livro : livros) {
						System.out.println(livro);
					}
				}
				System.out.println();
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("O livro: \"" + livros.pop() + "\" foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("O programa foi encerrado!");
				break;

			default:
				System.out.println("Digite uma opção válida!\n");
			}
		}
		while (opcao != 0);
	}

}
