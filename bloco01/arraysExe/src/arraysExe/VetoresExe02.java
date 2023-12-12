//package arraysExe;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class VetoresExe02 {
//
//	public static void main(String[] args) {
//		
//		int vetor[] = new int[10], impar[] = new int[10], par[] = new int[10], soma, contador = 0;
//		float media;
//		Scanner leia = new Scanner(System.in);
//		
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println("Digite o " + (i + 1) + "° valor: ");
//			vetor[i] = leia.nextInt();
//		}
//		
//		for(int i = 0; i < vetor.length; i++) {
//			if(vetor[i] % 2 == 0) {
//				par[contador] = vetor[i];
//				contador++;
//			}
//		}
//		
//		for(int pares: par) {
//			System.out.println(pares);
//		}
//		
//		
//	}
//
//}
