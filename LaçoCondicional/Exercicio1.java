package LaçoCondicional;

import java.util.Scanner;

public class Exercicio1 {

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
			maiorn=num1;
		}
		else if (num2>num1 && num2>num3)
		{
			maiorn=num2;
		}
		else
		{
			maiorn=num3;
		}
		
		System.out.printf("\nO maior nímero é: %d", maiorn);
		
		
	}

}
