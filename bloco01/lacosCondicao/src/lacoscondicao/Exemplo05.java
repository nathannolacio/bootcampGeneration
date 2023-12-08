package lacoscondicao;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		
		float nota1, nota2, media;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		leia.close();

		media = (nota1 + nota2) / 2;
		System.out.printf("A sua média foi de: %.2f", media);

		if (media >= 6) {
			System.out.println("\nParabéns. Você foi aprovado!");
		} else if(media >= 5) {
			System.out.println("Você está de exame.");
		}
		else {
			System.out.println("Que pena. Você não foi aprovado");
		}

	}

}
