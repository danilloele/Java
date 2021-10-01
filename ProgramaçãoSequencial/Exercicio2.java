package ProgramaçãoSequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	int totald, anos, meses, dias;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Entre com o total de dias vividos: ");
	totald= leia.nextInt();
	
	anos= totald /365;
	meses= (totald%365) /30;
	dias= meses%30;
	
	System.out.println("A sua idadade é de " + anos + " anos, " +meses+ " meses e " +dias+ " dias.");
	
	
	}
	
	
	
	
}
