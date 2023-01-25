package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String>{

	//1ª - IMPLEMENTAÇÃO DA INTERFACE
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
