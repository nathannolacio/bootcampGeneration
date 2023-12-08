package lacosRepeticao;

import java.util.Scanner;

public class WhileExemplo02 {

	public static void main(String[] args) {
		String continua = "s";
		
		
		Scanner leia = new Scanner(System.in);
		while(continua.equals("s")) {
			System.out.println("Bom dia!");
			continua = leia.nextLine();
		}
		leia.close();
		
		

	}

}
