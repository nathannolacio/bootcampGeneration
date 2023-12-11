package arrays;

public class MatrizExemplo05 {

	public static void main(String[] args) {
		
		String alunes[][] = {{"Larissa", "Dani", "Igor"}, 
							 {"Thaiana", "Taís", "Thayná"},
							 {"Nat", "Nathan", "Nathália"}};

		for(String[] linha: alunes) {
			for(String alune: linha) {
				System.out.println(alune);
			}
		}
	}

}
