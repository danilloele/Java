package POO;

public class Cavalo extends Animal {

	private String haras;
	
	public Cavalo (String nome, String a��o, int idade, String haras)
	{
		super(nome, a��o, idade);
		this.haras=haras;
	}

	public String getHaras() {
		return haras;
	}

	public void setHaras(String haras) {
		this.haras = haras;
	}
	
	public void infoCavalo()
	{
		System.out.println("\nNo haras " +haras+ " o cavalo " +getNome()+ " ,de " +getIdade()
		+ " anos, � treinado para " +getA��o()+ " profissionalmente ");
	}
}
