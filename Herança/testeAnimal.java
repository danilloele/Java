package POO;

public class testeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog= new Cachorro ("Billy", "late", "correr", 12, "Angelica", "m�dio");
		
		dog.infoCachorro();
		
        Cavalo horse= new Cavalo ("Al�pio", "correr", 15, "Marilu");
		
		horse.infoCavalo();
		
        Pregui�a bichop= new Pregui�a ("Vania", "subir em �rvores", 80, "mam�feros");
		
		bichop.infoPregui�a();
	}

}
