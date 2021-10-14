package POO;

public abstract class Animal {

	private String nome;
	private String ação;
	private int idade;
	
	public Animal (String nome, String ação, int idade)
	{
		this.nome=nome;
		this.ação= ação;
		this.idade=idade;
	}

	public abstract void Som();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAção() {
		return ação;
	}

	public void setAção(String ação) {
		this.ação = ação;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
