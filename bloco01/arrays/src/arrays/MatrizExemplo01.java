package arrays;

public class MatrizExemplo01 {

	public static void main(String[] args) {
		
		String matriz[][] = {{"v1", "v2", "v3"}, {"v1", "v2", "v3"}, {"v1", "v2", "v3"}};
		
		String [][] matriz1 = {{"v1", "v2", "v3"}, 
							  {"v1", "v2", "v3"},
							  {"v1", "v2", "v3"}};
		
		String matriz2[][] = new String [3][3];
		
		String[][] matriz3 = new String [3][3];
		
		System.out.println(matriz + " " + matriz1 + " " + matriz2 + " " + matriz3);
		
	}

}
