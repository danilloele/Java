package Programa��oSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double custo, dist, imp, total, taxa;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("Digite o custo de f�brica do ve�culo: ");
		custo= leia.nextFloat();
		
		dist= (custo*0.28);
		imp= (custo*0.45);
		
		taxa= (dist+imp) + custo;
		
		System.out.println("\nO valor final do do ve�culo � de: R$ " +taxa);
		
		
	}

}
