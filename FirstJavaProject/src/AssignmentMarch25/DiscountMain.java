package AssignmentMarch25;

public class DiscountMain {

	public static void main(String[] args) {
		
		System.out.println("-----------Largest three Numbers ------");	
		
		LargeThreeNumbers Larger = new LargeThreeNumbers();
		Larger.n1 = 5;
		Larger.n2 = 44;
		Larger.n3 = 22;
		Larger.LargestNumber();
		
		System.out.println("----------- Product Discount ------------");
		
		DiscountProgram product = new DiscountProgram();
		product.isProductAvailable = true;
		product.ispromoAvailable = true;
		product.promo5 = false;
		product.promo10 = true;
		product.promo20 = false;
		product.promoValue = 5;
		product.actualPrice = 450.53;
		product.productDiscount();
		
		
		System.out.println("-------------Ontario Licence--------------");
		
		OntarioLicence Licence = new OntarioLicence();
		Licence.age = 25;
		Licence.G1 = false;
		Licence.G2 = false;
		Licence.G = true;
		Licence.DrivingLicence();

				
		
	}

}
