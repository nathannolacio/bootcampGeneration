package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExe02 {

	public static void main(String[] args) {
		
		int num;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que quer encontrar: ");
		num = leia.nextInt();
		leia.close();
		
		if(numeros.contains(num)) {
			System.out.println("O número " + num + " está localizado na posição: " + numeros.indexOf(num));
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}

	}

}
