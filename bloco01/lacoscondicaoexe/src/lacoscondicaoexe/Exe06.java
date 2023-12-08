package lacoscondicaoexe;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		String nome;
		int cod;
		float salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o código do cargo(de 1 a 6): ");
		cod = leia.nextInt();
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		leia.close();
		
		switch (cod) {
		case 1:
			salario += salario * 0.10f;
			System.out.println("\nNome do colaborador: " + nome
					+ "\nCargo: Gerente \nSalário: R$ " + salario);
			break;
		case 2:
			salario += salario * 0.07f;
			System.out.println("\nNome do colaborador: " + nome
					+ "\nCargo: Vendedor \nSalário: R$ " + salario);
			break;
		case 3:
			salario += salario * 0.09f;
			System.out.println("\nNome do colaborador: " + nome
					+ "\nCargo: Supervisor \nSalário: R$ " + salario);
			break;
		case 4:
			salario += salario * 0.06f;
			System.out.println("\nNome do colaborador: " + nome
					+ "\nCargo: Motorista \nSalário: R$ " + salario);
			break;
		case 5:
			salario += salario * 0.05f;
			System.out.println("\nNome do colaborador: " + nome
					+ "\nCargo: Estoquista \nSalário: R$ " + salario);
			break;
		case 6:
			salario += salario * 0.08f;
			System.out.println("\nNome do colaborador: " + nome
					+ "\nCargo: Técnico de TI \nSalário: R$ " + salario);
			break;
			
		}

	}

}
