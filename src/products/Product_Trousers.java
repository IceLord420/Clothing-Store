package products;

public class Product_Trousers extends Product_Base {
	private Integer size;

	public Product_Trousers(String name, String brand, double price, String color, Integer size) {
		super(name, brand, price, color);
		if(!checkIfTheSizeIsCorrect(size)) {
			System.out.println("Wrong size");
			this.size = -1;
		}
	}

	@Override
	public String getTheSize() {
		return size.toString();
	}

	@Override
	public Boolean checkIfTheSizeIsCorrect(String size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean checkIfTheSizeIsCorrect(Integer size) {
		for (int i = 42; i <= 66; i += 2)
			if (i == size) {
				this.size = size;
				return true;
			}
		return false;
	}

}
