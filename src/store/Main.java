package store;

import java.time.LocalDate;

public class Main {
	public static Boolean Tuesday = false;

	public static void main(String[] args) {
		String day = LocalDate.now().getDayOfWeek().name();
		if (day == "TUESDAY")
			Tuesday = true;

		Cart.AddToCart1();
		Cashier.PrintProducts();

		Cart.AddToCart2();
		Cashier.PrintProducts();

		Cart.AddToCart3();
		Cashier.PrintProducts();

	}

}
