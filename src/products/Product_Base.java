package products;

public abstract class Product_Base implements ISize{
	private String name;
	private String brand;
	private double price;
	private String color;
	
	public Product_Base(String name, String brand, double price, String color) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	
	
}
