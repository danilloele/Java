package POO;

public class Cavalo extends Animal {

	private String haras;
	
	public Cavalo (String nome, String ação, int idade, String haras)
	{
		super(nome, ação, idade);
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
		+ " anos, é treinado para " +getAção()+ " profissionalmente ");
	}
}
