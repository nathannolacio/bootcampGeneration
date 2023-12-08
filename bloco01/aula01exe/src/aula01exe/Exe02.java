package aula01exe;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o a quarta nota: ");
		n4 = leia.nextFloat();
		leia.close();
		
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("A média final é: %.2f", media);
		
	}

}
