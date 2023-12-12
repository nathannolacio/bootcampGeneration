package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExe01 {

	public static void main(String[] args) {
		
		int num;
		Set<Integer> setNum = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° valor (não repita os números)");
			num = leia.nextInt();
			
//			while(setNum.contains(num)) {
//				System.out.println("O número " + num + " já foi inserido. Digite outro número: ");
//				num = leia.nextInt();		
//			}
			setNum.add(num);
		}
		leia.close();
		Iterator<Integer> iSetNum = setNum.iterator();
		while(iSetNum.hasNext()) {
			System.out.println("Os números digitados foram: " + iSetNum.next());
		}
	}

}
