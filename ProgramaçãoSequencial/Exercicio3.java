package ProgramaçãoSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seg, min, h, temps, restmin;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos segundos tem o evento? ");
		temps= leia.nextInt();
		
		h= temps /365;
		min= (temps%365) /30;
		seg= min%30;
		
		System.out.println("O evento tem " +h+ " horas, " +min+ " minutos e " +seg+ " segundos.");
	}

}
