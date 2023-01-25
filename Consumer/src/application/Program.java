package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		//IMPRIME NA TELA O PREÇO DOS ITENS COM UM ACRESCIMO DE 10%
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Mousepad", 75.87));
		
		//1ª - IMPLEMENTAÇÃO DA INTERFACE
		//list.forEach(new PriceUpdate());

		//2ª - Reference method com metodo estatico
		//list.forEach(Product::staticPriUp);
		
		//3ª - Reference method com metodo nao estatico
		//list.forEach(Product::nonstaticPriUp);
		
		//4ª - Expressao lambda declarada
		double factor = 1.1;
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		//list.forEach(cons);
		
		//5ª - Expressao lambda inline
		list.forEach( p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
	}

}
