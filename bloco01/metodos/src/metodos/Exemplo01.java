package metodos;

public class Exemplo01 {
	
	public static void ola() {
		int x = 2 + 2;
		System.out.println(x);
	}
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		ola();
		soma(4, 9);
		System.out.println(soma(4, 9) + 1);
	}

}
