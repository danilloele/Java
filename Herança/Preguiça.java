package POO;

public class Preguiça extends Animal {

	private String classe;
	
	public Preguiça (String nome, String ação, int idade, String classe)
	{
		super(nome, ação, idade);
		this.classe= classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void infoPreguiça ()
	{
		System.out.println("\n" +getNome()+ " é um bicho-preguiça, tem " +getIdade()+ " anos e pertence a classe dos "
	+classe+  ". No dia-a-dia " +getNome()+ " gosta de " +getAção());
				
	}
}
