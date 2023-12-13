package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();

		do {
			System.out.println("****** ***** **** *** ** * MENU * ** *** **** ***** ******");
			System.out.println("*                                                        *");
			System.out.println("*             1 - Adicionar cliente na fila              *");
			System.out.println("*             2 - Listar todos os clientes               *");
			System.out.println("*             3 - Retirar cliente da fila                *");
			System.out.println("*             0 - Sair                                   *");
			System.out.println("*                                                        *");
			System.out.println("****** ***** **** *** ** * **** * ** *** **** ***** ******");

			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente que será adiciona à fila: ");
				leia.nextLine();
				String nomeCliente = leia.nextLine();
				clientes.add(nomeCliente);
				System.out.println("O cliente \"" + nomeCliente + "\" foi adicionado à fila!");
				System.out.println();
				break;

			case 2:
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("\nOs clientes da fila são: ");
					for (String cliente : clientes) {
						System.out.println(cliente);
					}
				}
				System.out.println();
				break;

			case 3:
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("O cliente: \"" + clientes.remove() + "\" foi retirado da fila!");
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
		leia.close();

	}

}
