package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);

	List<Product> lista = new ArrayList<>();
		
		lista.add(new Product("TV 4K", 5899.89));
		lista.add(new Product("Espuma de barbear", 35.90));
		lista.add(new Product("Alavanca", 350.00));

//		2ª - AGORA IMPLEMENTAÇÃO DO COMPARATOR COM EXPRESÃO LAMBDA
//		Comparator<Product> comp = (p1, p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
//		1ª - INUTILIZADA A CLASSE MyComparator, IMPLEMENTAÇÃO DO COMPARATOR DIRETO NO PROGRAMA PRINCIPAL				
//		Comparator<Product> comp = new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
		
//		3ª - AGORA A IMPLEMENTAÇÃO DO COMPARATOR COM EXPRESÃO LAMBDA DIRETO NO ARGUMENTO
		lista.sort((p1, p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : lista)
		System.out.println(p);
		
	}

}
