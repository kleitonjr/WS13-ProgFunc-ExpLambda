package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		//IMPRIME NA TELA O NOME DOS ITENS TUDO MAIUSCULO

		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.50));
		list.add(new Product("hd case", 80.90));
		list.add(new Product("mousepad", 75.87));
		
		//1ª - IMPLEMENTAÇÃO DA INTERFACE
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//2ª - Reference method com metodo estatico
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		//3ª - Reference method com metodo nao estatico
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//4ª - Expressao lambda declarada
		//Function<Product, String> names4 = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(names4).collect(Collectors.toList());
		
		//5ª - Expressao lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		
		names.forEach(System.out::println);

		
	}

}
