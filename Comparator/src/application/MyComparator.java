package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{

//	INUTILIZADA A CLASSE MyComparator, IMPLEMENTAÇÃO DO COMPARATOR DIRETO NO PROGRAMA PRINCIPAL
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}	

}
