package store;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cashier {
	public static void PrintProducts() {
		double discount = 0, totalSum = 0;

		System.out.println("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss")));
		System.out.println("");
		System.out.println("---Products---");

		for (var product : Cart.productsInTheCart) {
			System.out.println("");
			System.out.println("");
			System.out.println(product.getName() + " - " + product.getBrand());
			System.out.println("$" + product.getPrice());
			totalSum += product.getPrice();
			System.out.println("#discount " + Purchase.CheckForDiscount(product) + "% -$"
					+ Math.round(product.getPrice() * Purchase.CheckForDiscount(product) / 100 * 100.0) / 100.0);
			discount += Math.round(product.getPrice() * Purchase.CheckForDiscount(product) / 100 * 100.0) / 100.0;
		}

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("SUBTOTAL: $" + totalSum);
		System.out.println("DISCOUNT: -$" + Math.round(discount * 100.0) / 100.0);
		System.out.println("");
		System.out.println("TOTAL: $" + Math.round((totalSum - discount) * 100.0) / 100.0);
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Cart.productsInTheCart = new ArrayList<>();
	}
}
