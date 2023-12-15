package aula_pacotes;

import java.util.Scanner;

import aula_pacotes.calculo.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float num1 = 0, num2 = 0;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		num2 = leia.nextFloat();
		leia.close();
		
		System.out.println("Soma dos valores: " + Calculadora.soma(num1, num2));
		System.out.println("Soma dos valores: " + Calculadora.divisao(num1, num2));
		System.out.println("Soma dos valores: " + Calculadora.multiplicacao(num1, num2));
		System.out.println("Soma dos valores: " + Calculadora.subtracao(num1, num2));
	}

}
