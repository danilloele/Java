package POO;

public class testeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog= new Cachorro ("Billy", "late", "correr", 12, "Angelica", "médio");
		
		dog.infoCachorro();
		
        Cavalo horse= new Cavalo ("Alípio", "correr", 15, "Marilu");
		
		horse.infoCavalo();
		
        Preguiça bichop= new Preguiça ("Vania", "subir em árvores", 80, "mamíferos");
		
		bichop.infoPreguiça();
	}

}
