package La�oRepeti��o;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int num, x=0;
		
		Scanner leia= new Scanner (System.in);
		
		do
		{
			System.out.println("\nEntre com um n�mero: ");
			num= leia.nextInt();
			
			x +=num;
		}
		
		while (num !=0);
		System.out.printf("\nA soma dos n�meros �: %d" ,x);
	}
}
