package La�oRepeti��o;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,p=0,i=0,x;
		
		Scanner leia= new Scanner(System.in);
		
		for(x=0;x<10;x++)
		{
			System.out.println("Entre com um n�mero: ");
			num= leia.nextInt();
			
			if (num%2 == 0)
			{
				p++;
			}
			else
			{
				i++;
			}
			
		}
		System.out.printf("\nO total de n�meros pares �: %d", p);
		System.out.printf("\nO total de n�meros �mpares �: %d", i);
		
		
		
	}

}
