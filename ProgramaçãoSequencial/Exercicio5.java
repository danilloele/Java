package ProgramaçãoSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float  nota1, nota2, nota3, media;
		int peso1= 2, peso2= 3, peso3= 5;
		String nome;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		nome= leia.next();
		System.out.println("Digite sua primeira nota: ");
		nota1= leia.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		nota2= leia.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		nota3= leia.nextFloat();
		
		media= ((nota1*peso1) + (nota2*peso2)+ (nota3*peso3)) / (peso1+peso2+peso3);
		System.out.println("O aluno: " +nome+ " tem a média de: " +media);
	}

}
