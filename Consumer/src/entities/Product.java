package entities;

public class Product{

	private String name;
	private Double price;

	public Product() {
	}
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
	
	//2ª - Reference method com método estático
	public static void staticPriUp(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	//3ª - Reference method com método não estático
	public void nonstaticPriUp() {
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return name + ", price = R$" + String.format("%.2f", price);
	}

}
