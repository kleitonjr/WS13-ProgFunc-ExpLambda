package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		//SO IMPRIME NA TELA ITENS COM O PREÇO MENOR QUE R$100.00
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Mousepad", 75.87));

		//1ª - IMPLEMENTAÇÃO DA INTERFACE
		//list.removeIf(new ProductPredicate() );
		
		//2ª - Reference method com metodo estatico
		//list.removeIf(Product::staticProdPric);
		
		//3ª - Reference method com metodo nao estatico
		//list.removeIf(Product::nonStaticProdPric);

		//4ª - Expressao lambda declarada
		double min = 100.0;
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		//list.removeIf(pred);

		//5ª - Expressao lambda inline		
		list.removeIf(p -> p.getPrice() >= min);
		
		for(Product p : list) {
			System.out.println(p);	
		}
		
	}

}
