package arraysExe;

public class MatrizExe01 {

	public static void main(String[] args) {
		
		int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, somaP = 0, somaS = 0;
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				if(l == c) {
					System.out.print(matriz[l][c] + " ");
					somaP += matriz[l][c];
				}
			}
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				if(l + c == 2) {
					System.out.print(matriz[l][c] + " ");
					somaS += matriz[l][c];
				}
			}
		}
		
		System.out.println("\n\nSoma dos elementos da Diagonal Principal: " + somaP);
		System.out.println("\n\nSoma dos elementos da Diagonal Principal: " + somaS);

	}

}