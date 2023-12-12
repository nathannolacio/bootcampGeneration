package setExemplos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exemplo01 {

	public static void main(String[] args) {
		String nome;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		nome = leia.nextLine();
		leia.close();
		
		Set<String> setNomes = new HashSet<String>();
		Set<Long> setCodigo = new HashSet<Long>();
		
		setNomes.add("Cintia");
		setNomes.add("Amanda");
		setNomes.add("amanda");
		setNomes.add("Nath");
		setNomes.add("Andre");
		setNomes.add("Andre");
		setNomes.add(nome);

		System.out.println(setNomes);
		
		System.out.println();
		System.out.println("setNome está vazio? " + setNomes.isEmpty());
		System.out.println("setCodigo está vazio? " + setCodigo.isEmpty());
		System.out.println("nome Nath no setNomes? " + setNomes.contains("Nath"));
		setNomes.remove("amanda");
		
		System.out.println();
		for(String nomes : setNomes) {
			System.out.println("temos no set o nome: " + nomes);
		}
		
		System.out.println();
		Iterator<String> isetNomes = setNomes.iterator();
		while(isetNomes.hasNext()) {
			System.out.println(isetNomes.next());
		}

	}

}
