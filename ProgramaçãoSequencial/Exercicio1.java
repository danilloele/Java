package ProgramaçãoSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idadeD, idadeM, idadeA, total;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		nome= leia.next();
		System.out.println("Qual a sua idade?");
		idadeA= leia.nextInt();
		System.out.println("Você tem " + idadeA + "anos e quantos meses?");
		idadeM =leia.nextInt();
		System.out.println("Você tem" + idadeA + "anos," + idadeM + "meses. E quantos dias?");
		idadeD =leia.nextInt();
		
		total= (idadeA*365) + (idadeM*30) + (idadeD);
		
		System.out.println("Você tem" + total + "dias de vida");
		
	}

}
