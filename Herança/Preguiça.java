package POO;

public class Pregui�a extends Animal {

	private String classe;
	
	public Pregui�a (String nome, String a��o, int idade, String classe)
	{
		super(nome, a��o, idade);
		this.classe= classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void infoPregui�a ()
	{
		System.out.println("\n" +getNome()+ " � um bicho-pregui�a, tem " +getIdade()+ " anos e pertence a classe dos "
	+classe+  ". No dia-a-dia " +getNome()+ " gosta de " +getA��o());
				
	}
}
