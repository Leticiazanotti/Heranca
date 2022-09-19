package Poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n***********ESTOQUE************");
			System.out.println("\nMenu\n");
			System.out.println("Bem vindo, escolha uma opção: ");
			System.out.println("\n(1)Adicionar ao carrinho ");
			System.out.println("\n(2)Deseja remover algum produto?");
			System.out.println("\n(3)Atualização da lista");
			System.out.println("\n(4)Encerrar compra? ");
			op = leia.nextInt();
			System.out.println("********************************");
			
			switch(op) {
			case 1: leia.nextLine();
			System.out.println(" Adicione um produto a sua lista ");
			String produto = leia.nextLine();
			estoque.add(produto);
			break;
			
			case 2: leia.nextLine();
			System.out.println("\nDeseja remover o produto? ");
			String produto1 = leia.nextLine();
			if(estoque.contains(produto1)) {
				estoque.remove(produto1);
				
			}else {
				System.out.println("Desculpe não temos esse produto no estoque ");
				
			}
			System.out.println(estoque);
			break;
			
			case 3: leia.nextLine();
			System.out.println("\nDeseja remover o produto? ");
			String verifica = leia.nextLine();
			String novo = leia.nextLine();
			System.out.println("\nEscolha o produto para substituição "+verifica);
			if(estoque.contains(verifica)) {
				estoque.remove(verifica);
				estoque.add(novo);
				
			}
			System.out.println(estoque);
			break;
			
			case 4:
			System.out.println("\nEsses são seus produtos: ");
			System.out.println();
			break;
			
			case 0: 
			System.out.println("Encerrando a compra...");
			System.out.println("+++Obriado pela preferência+++");
			break;
			default:
				System.out.println("Opção inválida!");
				
				
		}	
			
		}
		while(op!=0);
}
	

}
