package heranca;

public class Terrestre extends Transporte{
	private int numeroRodas;
	protected float velocidade;
	
	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade);
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O número de rodas é: " + getNumeroRodas());
		System.out.println("A velocidade é de: " + getVelocidade());
	}
	
	
}
