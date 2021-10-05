package LaçoRepetição;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, x=0, y=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\nEntre com sua idade: ");
		idade= leia.nextInt();
		
		while (idade != -99)
		{
			if (idade<=21 && idade>0)
			{
			x++;
			}
			else if (idade>=50)
			{
			y++;
			}
			System.out.printf("\nEntre com sua idade: ");
			idade= leia.nextInt();
		}
		
		System.out.printf("\nOs com menos de 21 são: %d, e os maiores de 50 são: %d" ,x, y);
		
	}

}
