package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExe01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "° cor: ");
			cores.add(leia.nextLine());
		}
		leia.close();
		System.out.println("\nAs cores adicionadas foram: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		System.out.println("\nCores ordenadas:");
		for(String cor : cores) {
			System.out.println(cor);
		}

	}

}
