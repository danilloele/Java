package LaçoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("Entre com a sua idade: ");
		idade= leia.nextInt();
		leia.nextLine();
		System.out.printf("\nSua idade: %d", idade);
		
		if (idade>=10 && idade<=14)
		{
			System.out.printf("\nVocê pertence a categoria: Infantil");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.printf("\nVocê pertence a categoria: Juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.printf("\nVocê pertence a categotia: Adulto");
		}
		else
		{
			System.out.printf("\nSua idade não se enquadra nas categorias disponíveis.");
		}
	}

}
