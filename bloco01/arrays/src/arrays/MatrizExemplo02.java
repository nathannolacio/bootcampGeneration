package arrays;

public class MatrizExemplo02 {

	public static void main(String[] args) {
		
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		for(int l = 0; l < matrizInteiros.length; l++) {
			for(int c = 0; c < matrizInteiros.length; c++) {
				System.out.println("O valor armazenado na posição ["
						+ l + "][" + c + "] é: " + matrizInteiros[l][c]);
			}
		}
		
//		for(int c = 0; c < matrizInteiros.length; c++) {
//			for(int l = 0; l < matrizInteiros.length; l++) {
//				System.out.print(matrizInteiros[c][l] + " ");
//			}
//			System.out.println();
//		}
	}

}
