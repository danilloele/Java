package Programa��oSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1, numero2, numero3, r, s, d, pr, ps;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1=leia.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		numero2=leia.nextFloat();
		System.out.println("Digite o terceiro n�mero: ");
		numero3=leia.nextFloat();
		r= (numero1+numero2);
		s= (numero2+numero3);
		
		pr= Math.pow(r, 2);
		ps= Math.pow(s, 2);
		d= (pr+ps) /2;
		
		System.out.println("D � igual a: "+d+" . ");
				
		
	}

}
