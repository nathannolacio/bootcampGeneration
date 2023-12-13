package estruturaDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			fila.add(i);
		}
		
		System.out.println("\nElementos da fila: " + fila);
		System.out.println("\nRemovendo o elemento: " + fila.remove());
		System.out.println("Fila atualizada: " + fila);
		System.out.println("\nAdicionando elemento na fila: " + fila.add(10));
		System.out.println("Fila atualizada: " + fila);
		System.out.println("\nExibindo o primeiro elemento da fila: " + fila.peek());
		System.out.println("Exibindo o tamanho da fila: " + fila.size());
		System.out.println("Checando se existe um elemento na lista: " + fila.contains(7));
		System.out.println("Exibindo e retirando o primeiro item da fila (HEAD): " + fila.poll());
		System.out.println("Fila atualizada: " + fila);
		System.out.println("\nExibindo os itens com iterator:");
		
		Iterator<Integer> iterator = fila.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLimpanado a fila...");
		fila.clear();
		
		System.out.println("A fila está vazia? " + fila.isEmpty());
		
	}

}