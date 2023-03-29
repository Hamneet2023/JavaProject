package AssignmentMarch25;

public class DiscountProgram {

	boolean isProductAvailable;
	boolean ispromoAvailable;
	double actualPrice;
	double finalvalue;
	boolean promo5;
	boolean promo10;
	boolean promo20;
	double promoValue;
	double promoDiscountValue;
	double promoFinalValue;

	void productDiscount() {

		if (isProductAvailable) {
			double Discount = (actualPrice * 50) / 100;
			double finalValue = actualPrice - Discount;

			System.out.println("Actual price of the product is:" + "" + actualPrice + " "
					+ "after 50% discount the value of the product is:" + finalValue);
			
			if (ispromoAvailable) {

				if (promo5) {
					promoDiscountValue = (finalValue * promoValue) / 100;
					promoFinalValue = finalValue - promoDiscountValue;
					System.out.println("final value after promocode:" + promoFinalValue);
				}

				if (promo10) {
					promoDiscountValue = (finalValue * promoValue) / 100;
					promoFinalValue = finalValue - promoDiscountValue;
					System.out.println("final value after promocode:" + promoFinalValue);
				}

				if (promo20) {
					promoDiscountValue = (finalValue * promoValue) / 100;
					promoFinalValue = finalValue - promoDiscountValue;
					System.out.println("final value after promocode:" + promoFinalValue);
				}
				else {
					System.out.println("you do not have valid promo code please enter valid promo code");
				}
			} // isPromoAvailble ends here

			else {
				System.out.println("is Productavailable ends here");
			}

		} // is productAvaiable ends here
	}// function ends here
}// Discount main class ends here
