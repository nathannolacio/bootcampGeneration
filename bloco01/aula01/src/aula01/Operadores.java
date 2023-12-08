package aula01;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//operadores aritmeticos
		int valor1 = 10;
		int valor2 = 5;
		int numero1 = 8;
		int numero2 = 2;
		
		int resultado = valor1 + valor2;
		System.out.println(resultado);
		
		resultado = valor1 - valor2;
		System.out.println(resultado);
		
		resultado = valor1 * valor2;
		System.out.println(resultado);
		
		resultado = valor1 / valor2;
		System.out.println(resultado);
		
		resultado = numero1 % numero2;
		System.out.println(resultado);
		
		String nome = "Nathan";
		String nomeCompleto = nome + " Nolacio";
		System.out.println(nomeCompleto);
		
		resultado = (numero1 + numero2) * 3;
		System.out.println(resultado);
		
		System.out.println("\n****************************");
		System.out.println("Autoincremento");
		int x = 1;
		x++;
		System.out.println(x);
//		System.out.println(x);
		//System.out.println(++x);
		
		System.out.println("\n****************************");
		System.out.println("Decremento");
		int y = 5;
		//System.out.println(y--);
		System.out.println(--y);
		
		int n1 = 3;
		n1 += 5;
		
		//n1 = n1 + 2;
		
		System.out.println(n1);
		
		String produto = "Mouse";
		produto += " gamer";
		System.out.println(produto);
		
		System.out.println("\n*************************");
		int ano = 2023;
		ano /= 2;
		System.out.println(ano);
	}

}
