package heranca;

public class TestaTransporte {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(4);
		t1.visualizar();
		
		Automovel automovel = new Automovel(5, 4, 150.8f, "Verde", 4, "abc1512", 5);
		automovel.visualizar();                                                            
	}

}
