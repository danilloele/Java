package POO;

public abstract class Animal {

	private String nome;
	private String a��o;
	private int idade;
	
	public Animal (String nome, String a��o, int idade)
	{
		this.nome=nome;
		this.a��o= a��o;
		this.idade=idade;
	}

	public abstract void Som();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getA��o() {
		return a��o;
	}

	public void setA��o(String a��o) {
		this.a��o = a��o;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
