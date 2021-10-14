package POO;

public class Cachorro extends Animal {

	private String dono;
	private String porte;
	
	public Cachorro (String nome, String a��o, int idade, String dono, String porte)
	{
		super(nome, a��o, idade);
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
				+ " e tem " +getIdade()+ " anos. " +getNome()+ " gosta de " +getA��o());
	}
	@Override
	public void Som()
	{
		System.out.println("au au au");
	}
}
