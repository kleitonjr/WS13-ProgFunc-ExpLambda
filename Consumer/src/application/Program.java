package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Mouse", 75.87));
		
//		1� - Implementa��o da interface
//		list.forEach(new PriceUpdate());

//		2� e 3� - Reference method com m�todo est�tico e n�o est�tico
//		list.forEach(Product::staticPriUp);
//		list.forEach(Product::nonstaticPriUp);
		
//		4� - Express�o lambda declarada
		double factor = 1.1;
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//		list.forEach(cons);
		
//		5� - Express�o lambda inline
		list.forEach( p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
	}

}
