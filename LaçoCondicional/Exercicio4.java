package LaçoCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		double res;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("Entre com um núnemro: ");
		num= leia.nextInt();
		
		if (num%2==0)
		{
			res= Math.sqrt(num);
		}
		else
		{
			res= Math.pow(num, 2);
		}
		
		System.out.println("Resultado: " +res);
	}

}
