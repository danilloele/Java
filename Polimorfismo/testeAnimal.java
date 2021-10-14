package POO;


public class testeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cachorro dog= new Cachorro ("Billy", "correr", 12, "Angelica", "médio");
		
		dog.infoCachorro();
		
        Cavalo horse= new Cavalo ("Alípio", "correr", 15, "Marilu");
		
		horse.infoCavalo();
		
        Preguiça bichop= new Preguiça ("Vania", "subir em árvores", 80, "mamíferos");
		
		bichop.infoPreguiça();
		
		 int n = (int) (Math.random()*3.0);
	        System.out.println("\nEstes amimais emitem sons." );

	        switch(n)
	        {
	        case 0: System.out.println("O cavalo faz: ");
	        	horse.Som(); break;
	        case 1: System.out.println("O cahorro faz: ");
	        	dog.Som(); break;
	        case 2: System.out.println("O bicho preguiça faz: "); 
	        	bichop.Som(); break;
	        default: System.out.println("\nErro inesperado");
	}
	        
	       
	}
}
