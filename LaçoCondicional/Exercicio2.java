package LaçoCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3, maiorn;
		Scanner leia= new Scanner (System.in);
		
		System.out.printf("Entre com o primeiro número: ");
		num1= leia.nextInt();
		System.out.printf("Entre com o segundo número: ");
		num2= leia.nextInt();
		System.out.printf("Entre com o terceiro número: ");
		num3= leia.nextInt();
		
		if (num1>num2 && num1>num3) 
		{
			if (num2>num3)
			{
				System.out.printf("%d", num3);
				System.out.printf("%d", num2);
				System.out.printf("%d", num1);
			}
			else
			{
				System.out.printf("%d", num2);
				System.out.printf("%d", num3);
				System.out.printf("%d", num1);
			}
		}
		else if (num2>num1 && num2>num3)
		{
			if (num1>num3)
			{
				System.out.printf("%d", num3);
				System.out.printf("%d", num1);
				System.out.printf("%d", num2);
			}
			else
			{
				System.out.printf("%d", num1);
				System.out.printf("%d", num3);
				System.out.printf("%d", num2);
			}
		}
		else if (num3>num1 && num3>num2)
		{
			if (num1>num2)
			{
				System.out.printf("%d", num2);
				System.out.printf("%d", num1);
				System.out.printf("%d", num3);
			}
			else
			{
				System.out.printf("%d", num1);
				System.out.printf("%d", num2);
				System.out.printf("%d", num3);
			}
		}
		
	}

}
