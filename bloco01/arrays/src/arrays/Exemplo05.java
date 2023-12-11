package arrays;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		int vetorInteiros[] = new int[5];
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1)+ "° número: ");
			vetorInteiros[i] = leia.nextInt();
		}
		
		System.out.println("Os números digitados foram: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "° número: " + vetorInteiros[i]);
		}

	}

}
