package lacosRepeticaoExe;

import java.util.Scanner;

public class WhileExe01 {

	public static void main(String[] args) {
		
		int idade, menor21 = 0, maior50 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			
			if(idade < 21) {
				menor21++;
			} else if(idade > 50) {
				maior50++;
			}
		}
		leia.close();
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21 + "\n"
				+ "Total de pessoas maiores de 50 anos: " + maior50);

	}

}
