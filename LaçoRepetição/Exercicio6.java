package LaçoRepetição;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, soman=0, cont=0;
		float media;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.printf("\nEntre com um número: ");
		num= leia.nextInt();
		do 
		{
			if (num%3==0)
			{
				soman += num;
				cont++;
			}
			System.out.printf("\nEntre com um número: ");
			num= leia.nextInt();
		}
		while (num!=0);
		
		media= soman/cont;
		System.out.printf("A media dos múltiplos de três é de: %.2f", media);
		
		
		
		
	}

}
