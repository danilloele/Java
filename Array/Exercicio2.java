package Array;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= new int[6];
		int x, contp=0, conti=0;
		
		Scanner leia= new Scanner (System.in);
		
		for (x=0;x<6;x++)
		{
			System.out.println("Entre com um n�mero: ");
			num[x]= leia.nextInt();
		}
		for (x=0;x<6;x++)
		{
			if (num[x] %2==0)
			{
				System.out.println("N�mero par: " +num[x]);
				contp++;
			}
			else
			{
				System.out.println("N�mero �mpar: " +num[x]);
				conti++;
			}
		}
		
		
		System.out.println("A soma dos n�meros pares � de: " +contp);
		System.out.println("A soma dos n�meros �mpares � de: " +conti);
	}

}
