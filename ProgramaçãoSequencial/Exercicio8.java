package ProgramaçãoSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double custo, dist, imp, total, taxa;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("Digite o custo de fábrica do veículo: ");
		custo= leia.nextFloat();
		
		dist= (custo*0.28);
		imp= (custo*0.45);
		
		taxa= (dist+imp) + custo;
		
		System.out.println("\nO valor final do do veículo é de: R$ " +taxa);
		
		
	}

}
