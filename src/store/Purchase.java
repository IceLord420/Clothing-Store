package store;

import products.Product_Base;

public class Purchase {
	public static int CheckForDiscount(Product_Base product) {
		int discount = 0;
		if (Main.Tuesday && product.getClass().getName() == "products.Product_Shirts")
			if (discount < 10)
				discount = 10;
		if (Main.Tuesday && product.getClass().getName() == "products.Product_Shoes")
			if (discount < 25)
				discount = 25;
		if (Cart.productsInTheCart.size() >= 3)
			if (discount < 20)
				discount = 20;
		return discount;
	}

}
