package POO;

public class Animal {

	private String nome;
	private String som;
	private String a��o;
	private int idade;
	
	public Animal (String nome, String som, String a��o, int idade)
	{
		this.nome=nome;
		this.som=som;
		this.a��o= a��o;
		this.idade=idade;
	}
	
	public Animal (String nome, String a��o, int idade)
	{
		this.nome=nome;
		this.a��o= a��o;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
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
