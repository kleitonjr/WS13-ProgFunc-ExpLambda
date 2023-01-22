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

		lista.sort((p1, p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : lista)
		System.out.println(p);
		
	}

}
