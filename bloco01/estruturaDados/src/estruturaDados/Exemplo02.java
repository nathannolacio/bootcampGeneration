package estruturaDados;

import java.util.Iterator;
import java.util.Stack;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		
		System.out.println("\nElementos da pilha: " + pilha);
		System.out.println("\nRetirando elementos da pilha: " + pilha.pop());
		System.out.println("Elementos da pilha: " + pilha);
		System.out.println("\nRetirando elementos da pilha: " + pilha.pop());
		System.out.println("Elementos da pilha: " + pilha);
		System.out.println("\nElemento no topo da pilha: " + pilha.peek());
		System.out.println("Adicionando elemento na pilha: " + pilha.push("Prato Roxo"));
		System.out.println("Elementos da pilha: " + pilha);
		System.out.println("\nTamanho da pilha: " + pilha.size());
		System.out.println("Existe elemento na pilha? " + pilha.contains("Prato Verde"));
		
		Iterator<String> iterator = pilha.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		pilha.clear();
		System.out.println("\nPilha está vazia? " + pilha.isEmpty());
	}

}
