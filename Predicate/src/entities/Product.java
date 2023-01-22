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
	
	//2� - Reference method com m�todo est�tico
	public static boolean staticPP(Product p) {
		return p.getPrice() >= 100.0;
	}
	//3� - Reference method com m�todo n�o est�tico
	public boolean nonstaticPP() {
		return price >= 100.0;
	}
	
	@Override
	public String toString() {
		return "Product [name= " + name + ", price= " + String.format("%.2f", price) + "]";
	}

}
