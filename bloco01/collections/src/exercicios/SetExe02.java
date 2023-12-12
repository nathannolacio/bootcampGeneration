package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExe02 {

	public static void main(String[] args) {
		
		int num;
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		System.out.println("Digite o valor que deseja encontrar: ");
		num = leia.nextInt();
		leia.close();
		
		if(setNumeros.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}

}
