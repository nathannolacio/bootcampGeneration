package lacoscondicao;

import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("* ** *** **** ***** MENU ***** **** *** ** *");
		System.out.println("\nDigite 1 para ver uma indicação de livro");
		System.out.println("Digite 2 para ler uma frase motivacional");
		System.out.println("Digite 3 para receber uma indicação");
		
		opcao = leia.nextInt();
		leia.close();	
		
		switch (opcao) {
		case 1:
			System.out.println("Livro: Harry Potter e a Pedra Filosofal");
		break;
		
		case 2:
			System.out.println("Frase Motivacional: Por mais fundo que seja o buraco, sorria. Afinal, ainda não tem terra caindo na sua cabeça");
		break;
		
		case 3:
			System.out.println("Música: Bless me - Kirk Franklin ft. Maverick City");
			
		default: 
			System.out.println("Opção inválida.");
		}
		

	}

}
