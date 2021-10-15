package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia= new Scanner(System.in);
		
		ArrayList<String> estoque= new ArrayList();
		Set<Integer> num= new HashSet<Integer>();
	
		do
		{
			System.out.println("\n-----------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(5) Deseja consultar disponibilidade de produtos no estoque?");
			System.out.println("\n(0) Deseja sair do programa?");
			System.out.println("\n-----------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op= leia.nextInt();
			
			switch (op)
			{
				case 1:
					leia.nextLine();
					System.out.println("\nDigite o produto para adicionar ao estoque: ");
					String ad= leia.nextLine();
					System.out.println("Digite a numeração do calçado: ");
					int tam=leia.nextInt();
					estoque.add(ad);
					num.add(tam);
					break;
				case 2:
					leia.nextLine();
					System.out.println("\nDigite o produto que deseja remover do estoque: ");
					String remove= leia.nextLine();
					
					if (estoque.contains(remove))
					{
						estoque.remove(remove);
					}
					else
					{
						System.out.println("\nProduto não existe no estoque!");
					}
					break;
				case 3:
					leia.nextLine();
					System.out.println("\nDigite o produto que quer atualizar: ");
					String atual= leia.nextLine();
					System.out.println("\nDigite o nome do produto que substituirá " +atual);
					String natual= leia.nextLine();
					System.out.println("Qual a numeração do(a): " +natual);
					int numatual= leia.nextInt();
					
					if (estoque.contains(atual))
					{
						estoque.remove(atual);
						estoque.add(natual);
						num.add(numatual);
					}
					else
					{
						System.out.println("\nProduto não existe no estoque!");
					}
					break;
				case 4:
					leia.nextLine();
					
					System.out.println("\nProdutos do estoque:");
					System.out.println(estoque);
					System.out.println("Disponível nas seguintes numerações: ");
					System.out.println(num);
					
					break;
				case 5:
					System.out.println("\nConsultar disponibilidade: ");
					String disp= leia.next();
					
					
					if (estoque.contains(disp))
					{
						System.out.println("\nNumeração: ");
						int ndisp= leia.nextInt();
						
						if (num.contains(ndisp))
						{
						System.out.println("\nO modelo está disponível!");
						}
						else
						{
							System.out.println("\nA numeração está indisponível.");
						}
					}
					else
					{
						System.out.println("\nO modelo está indisponível.");
					}
					break;
					default:
						System.out.println("\nOpção inválida!");
			}
		}
		while (op !=0);
	}

}
