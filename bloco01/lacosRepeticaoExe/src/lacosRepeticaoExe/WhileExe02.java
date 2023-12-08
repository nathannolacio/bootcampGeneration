package lacosRepeticaoExe;

import java.util.Scanner;

public class WhileExe02 {

	public static void main(String[] args) {
		
		int idade, genero, developer, backend = 0, mulheres = 0, homens = 0, fullstack = 0, total = 0, mediaIdade, somaIdade = 0;
		String continuar = "s";
		Scanner leia = new Scanner(System.in);		
		
		while(!continuar.equals("n")) {
			System.out.println("Digite a idade do colaborador: ");
			idade = leia.nextInt();
			somaIdade += idade;
			
			
			System.out.println("\nDigite a opção correspondente à identidade de gênero: \n\n"
					+ "1- Mulher Cis \n2- Homem Cis \n3- Não Binário \n4- Mulher Trans \n5- Homem Trans \n6- Outros");
			genero = leia.nextInt();
			
			System.out.println("\n\nDigite a opção correspondente ao cargo: \n\n"
					+ "1- Backend \n2- Frontend \n3- Mobile \n4- Fullstack");
			developer = leia.nextInt();
			
			
			
			if(developer == 1) {
				backend++;
			} else if((genero == 1 || genero == 4) && developer == 2) {
				mulheres++;
			}  else if((genero == 2 || genero == 5) && developer == 3 && idade > 40) {
				homens++;
			} else if(genero == 3 && developer == 4 && idade < 30) {
				fullstack++;
			}
			
			total++;
			
			System.out.println("Deseja cadastrar uma nova resposta?");
			leia.nextLine();
			continuar = leia.nextLine();
		}
		mediaIdade = somaIdade/total;
		
		leia.close();
		System.out.println("\n\nTotal de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheres);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homens);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + fullstack);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
		
	}

}
