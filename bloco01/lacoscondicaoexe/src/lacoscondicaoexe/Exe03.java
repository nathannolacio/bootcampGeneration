package lacoscondicaoexe;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("É a primeira doação? (responda com \"true\" ou \"false\")");
		primeiraDoacao = leia.nextBoolean();
		leia.close();
		
		if(idade >= 18 && idade <= 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto a doar sangue!");
		} else if(idade >= 60 && primeiraDoacao == true) {
			System.out.println(nome + " não está apto a doar sangue!");
		} else if (idade >= 18 && idade <= 59 && primeiraDoacao == true) {
			System.out.println(nome + " está apto a doar sangue!");
		} else if((idade < 18 || idade > 69) 
				&& (primeiraDoacao == true || primeiraDoacao == false)) {
			System.out.println(nome + " não está apto a doar sangue");
		}

	}

}
