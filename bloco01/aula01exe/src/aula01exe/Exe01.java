package aula01exe;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		leia.close();
		
		novoSalario = salario + abono;
		System.out.printf("O valor do salário + o abono é: R$%.2f", novoSalario);
		
		
	}

}
