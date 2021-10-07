package POO;

public class patinete {

	private String modelo;
	private String cor;
	private float peso;
	private float capacidade;
	
	public patinete (String modelo, String cor, float peso, float capacidade)
	{
		this.modelo= modelo;
		this.cor= cor;
		this.peso= peso;
		this.capacidade= capacidade;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nModelo: " +modelo+ " \nCor: " +cor);
		System.out.printf("Peso (Kg): %2.2f " ,peso);
		System.out.printf("\nCapacidade (Kg): %2.2f " ,capacidade);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
}
