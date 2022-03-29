package store;

import java.util.ArrayList;

import products.Product_Base;
import products.Product_Jackets;
import products.Product_Shirts;
import products.Product_Shoes;
import products.Product_Trousers;

public class Cart {
	public static ArrayList<Product_Base> productsInTheCart = new ArrayList<>();

	public static void AddToCart1() {
		productsInTheCart.add(new Product_Shirts("Blue Cotton Shirt", "BrandS", 14.99, "blue", "M"));
		productsInTheCart.add(new Product_Shirts("White Cotton Shirt", "BrandS", 15.99, "white", "M"));
		productsInTheCart.add(new Product_Trousers("Black Cotton Trousers", "BrandT", 29.99, "black", 50));
		productsInTheCart.add(new Product_Shoes("Black Leather Shoes", "BrandS", 59.99, "black", 43));
		productsInTheCart.add(new Product_Jackets("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", 50));
	}

	public static void AddToCart2() {
		productsInTheCart.add(new Product_Shirts("Black Silk Shirt", "BrandS", 29.99, "black", "L"));
		productsInTheCart.add(new Product_Shirts("White Silk Shirt", "BrandS", 29.99, "white", "L"));
	}

	public static void AddToCart3() {
		productsInTheCart.add(new Product_Trousers("Red Linen Trousers", "BrandT", 49.99, "red", 56));
		productsInTheCart.add(new Product_Shoes("Red Suede Shoes", "BrandS", 59.99, "red", 44));
		productsInTheCart.add(new Product_Shoes("Black Suede Shoes", "BrandS", 59.99, "black", 44));
		productsInTheCart.add(new Product_Jackets("Red Linen Suit Jacket,", "BrandJ", 99.99, "red", 56));
		productsInTheCart.add(new Product_Shirts("White Linen Shirt", "BrandS", 29.99, "white", "L"));

	}
}
