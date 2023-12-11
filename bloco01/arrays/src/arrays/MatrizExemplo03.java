package arrays;

import java.util.Scanner;

public class MatrizExemplo03 {

	public static void main(String[] args) {
		
		int matrizInteiros[][] = new int [3][3];
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0; l < matrizInteiros.length; l++) {
			for(int c = 0; c < matrizInteiros.length; c++) {
				System.out.println("Digite um valor para a posição: ["
						+ l + "][" + c + "]");
				matrizInteiros[l][c] = leia.nextInt();
			}
		}
		
		for(int l = 0; l < matrizInteiros.length; l++) {
			for(int c = 0; c < matrizInteiros.length; c++) {
				System.out.println("[" + l + "][" + c + "] = "
						+ matrizInteiros[l][c] + " ");
			}
		System.out.println();
		}

	}

}
