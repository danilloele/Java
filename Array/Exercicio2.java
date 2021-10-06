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
			System.out.println("Entre com um número: ");
			num[x]= leia.nextInt();
		}
		for (x=0;x<6;x++)
		{
			if (num[x] %2==0)
			{
				System.out.println("Número par: " +num[x]);
				contp++;
			}
			else
			{
				System.out.println("Número ímpar: " +num[x]);
				conti++;
			}
		}
		
		
		System.out.println("A soma dos números pares é de: " +contp);
		System.out.println("A soma dos números ímpares é de: " +conti);
	}

}
