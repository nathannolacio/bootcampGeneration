package listExemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Exemplo01 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
//		ArrayList<Integer> numeros = new ArrayList<Integer>();
//		ArrayList<Double> valor = new ArrayList<Double>();
		ArrayList<Long> codigo = new ArrayList<Long>();
		
		nomes.add("Gabrielle");
		nomes.add("Aline");
		nomes.add("Dani");
		nomes.add("Lucas");
		
		System.out.println(nomes);
		System.out.println(nomes.indexOf("Dani"));//mostra o indice do valor
		System.out.println(nomes.contains("Gustavo"));//verifica se o valor está na coleção e retorna um valor booleano
		System.out.println(nomes.get(3));//acessa o elemento pelo seu indice
		System.out.println(nomes.set(2, "David"));//substitui o valor do elemento
		System.out.println(nomes);
		System.out.println(codigo.isEmpty());//verifica se está vazio
		nomes.clear();
		System.out.println(nomes);
		
		nomes.add("Gabrielle");
		nomes.add("Aline");
		nomes.add("Dani");
		nomes.add("Lucas");
		
		nomes.remove(1);//remove o elemento pelo seu indice
		System.out.println(nomes);
		nomes.remove(nomes.indexOf("Dani"));//remove o elemento pelo seu valor
		System.out.println(nomes);
		
		nomes.add("Andressa");
		nomes.add("Liza");
		nomes.add("Liza");
		nomes.add("Gabriel");
		
		System.out.println("\n");
		for(String n : nomes) {
			System.out.println(n);
		}
		
		System.out.println("\n");
		Iterator<String> iNomes = nomes.iterator();
		while(iNomes.hasNext()) {
			System.out.println(iNomes.next());
		}
                               
	}

}
