package products;

public class Product_Shirts extends Product_Base {
	private String size;

	public Product_Shirts(String name, String brand, double price, String color, String size) {
		super(name, brand, price, color);
		if(!checkIfTheSizeIsCorrect(size)) {
			System.out.println("Wrong size");
			this.size = "-1";
		}
	}

	@Override
	public String getTheSize() {
		return size;
	}

	@Override
	public Boolean checkIfTheSizeIsCorrect(String size) {
		switch (size) {
		case "XS":
			this.size = size;
			break;
		case "S":
			this.size = size;
			break;
		case "M":
			this.size = size;
			break;
		case "L":
			this.size = size;
			break;
		case "XL":
			this.size = size;
			break;
		case "2XL":
			this.size = size;
			break;
		default:
			return false;
		}
		return true;
	}

	@Override
	public Boolean checkIfTheSizeIsCorrect(Integer size) {
		// TODO Auto-generated method stub
		return false;
	}

}
