package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//2ª - Reference method com metodo estatico
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	//3ª - Reference method com metodo nao estatico
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
		
	@Override
	public String toString() {
		return name + ", price = R$" + String.format("%.2f", price);
	}

}
