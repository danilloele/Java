package LaçoRepetição;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int num, x=0;
		
		Scanner leia= new Scanner (System.in);
		
		do
		{
			System.out.println("\nEntre com um número: ");
			num= leia.nextInt();
			
			x +=num;
		}
		
		while (num !=0);
		System.out.printf("\nA soma dos números é: %d" ,x);
	}
}
