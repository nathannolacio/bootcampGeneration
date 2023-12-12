package arraysExe;

import java.util.Scanner;

public class VetoresExe01 {

	public static void main(String[] args) {
		
		int num;
		boolean encontrado = false;
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja pesquisar: ");
		num = leia.nextInt();
		
		while(encontrado == false) {
			for(int i = 0; i < vetor.length; i++) {
				if(vetor[i] == num) {
					encontrado = true;
					System.out.println("O número " + num + " está localizado na posição: " + i);
				}
			}
			if(encontrado == false) {
				System.out.println("O némero " + num + " não foi encontrado!");
				System.exit(0);
				//break;
			}
		}
		leia.close();
		
	}

}
