package ProgramaçãoSequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double p1, p2, x1, x2, y1, y2, d, res, resd;
		
		Scanner leia =new Scanner (System.in);
		
		System.out.println("Digite os dados de P1: ");
		System.out.println("\nX1: ");
		x1= leia.nextFloat();
		System.out.println("X2: ");
		x2= leia.nextFloat();
		System.out.println("Digite os dados de P2: ");
		System.out.println("\nY1: ");
		y1= leia.nextFloat();
		System.out.println("Y2: ");
		y2= leia.nextFloat();
		
		System.out.flush();
		
		p1= (x2-x1);
		p2= (y2-y1);
		
		res= Math.pow(p1, 2) + Math.pow(p2, 2);
		d= Math.sqrt(res);
		
		System.out.println("D é igual a: " +d);
		
		
	}

}
