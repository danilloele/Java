package POO;

public class Cachorro extends Animal {

	private String dono;
	private String porte;
	
	public Cachorro (String nome, String som, String a��o, int idade, String dono, String porte)
	{
		super(nome, som, a��o, idade);
		this.dono= dono;
		this.porte= porte;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void infoCachorro()
	{
		System.out.println("\n" +getNome()+ " ,cachorro de " +dono+ " � de porte " +porte
				+ " e tem " +getIdade()+ " anos. " +getNome()+ " gosta de " +getA��o()
				+ " e " +getSom()+ " na presen�a de estranhos.");
	}
}
