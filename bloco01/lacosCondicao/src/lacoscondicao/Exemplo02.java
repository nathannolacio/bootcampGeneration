package lacoscondicao;

public class Exemplo02 {

	public static void main(String[] args) {
		
		int n1 = 4, n2 = 3, n3 = 4;
		
		if(n1 < 5) {
			System.out.println("O número " + n1 + " é menor que 5");
		}
		
		if (n1 < n2) {
			System.out.println("O número " + n1 + " é menor "
					+ "que o número" + n2);
		}
		
		if(n1 == n3) {
			System.out.println("O número " + n1 + " e o número "
					+ n3 + " são iguais");
		}
	}

}