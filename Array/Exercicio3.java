package Array;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int [][] matriz= new int [3][3];
        int linha=0, coluna=0, cont=0, soman=0;
		
		Scanner leia= new Scanner (System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for (linha=0;linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
			System.out.printf("Insira o elementoM[%d][%d]: ", linha+1, coluna+1);
			matriz[linha][coluna]= leia.nextInt();
			}
		}
			
		    for (linha=0;linha<3;linha++)
			{
				for (coluna=0;coluna<3;coluna++)
				{
				if (matriz[linha][coluna]>10)
				{
					System.out.println("\nNúmeros maiores de 10: " +matriz[linha][coluna]);
					soman += matriz[linha][coluna];
				}
				}
			}
		    
		    System.out.println("\nA soma dos números maiores de 10 é: " +soman);
	}
}

