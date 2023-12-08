package aula01exe;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, adcNoturno, hrsExtra, desconto, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adcNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		hrsExtra = leia.nextFloat();
		
		System.out.println("Digite os descontos: ");
		desconto = leia.nextFloat();
		leia.close();
		
		salarioLiquido = (salarioBruto + adcNoturno + (hrsExtra * 5)) - desconto;
		System.out.printf("O salário líquido é: R$%.2f", salarioLiquido);
	}

}
