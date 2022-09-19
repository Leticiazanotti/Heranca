package Poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Integer> listaEstoque = new ArrayList<Integer>();

		listaEstoque.add(1);
		listaEstoque.add(2);
		listaEstoque.add(3);
		listaEstoque.add(4);
		
		for(Integer listaProdutos:listaEstoque) {
			System.out.println(listaProdutos);
			
		}
		int primeiroProduto = listaEstoque.get(0);
		System.out.println("\nPrimeiro produto: "+primeiroProduto);
		System.out.println();
		
		
		for(int i=0;i<listaEstoque.size();i++) {
			System.out.println("\nProduto: "+listaEstoque.get(i));
			
		}
		
		Collections.sort(listaEstoque);
		System.out.println("\nLista em ordem: ");
		System.out.println(listaEstoque);
		System.out.println();
		

		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(5);
		meuSet.add(6);
		meuSet.add(7);
		meuSet.add(8);
		Iterator<Integer> iMeuSet = meuSet.iterator();
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
	}
		
		
		
		
		
		
		}


}
