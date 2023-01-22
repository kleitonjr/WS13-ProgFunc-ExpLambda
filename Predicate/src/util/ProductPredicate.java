 package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	//1ª - Implementação da interface
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
		
	}

}
