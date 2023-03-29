package firstPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone mb = new MobilePhone();
		mb.brandName = "Iphone";
		mb.modelNumber = 13;
		mb.operatingSystem = "ios";
		mb.ram = 16;
		mb.StorageCapacity = 128;
		mb.isCameraPresent = true;

		mb.makeCall();
		mb.sendAndReceiveText();
		mb.takePhoto();

		System.out.println(" **** Glucose blood monitor ***");

		Glucose_Blood_Monitor glucose = new Glucose_Blood_Monitor();
		glucose.BrandName ="Life";
      	glucose.blood_Strip = true;
		glucose.blood_Sample = true;
		glucose.color = "green";

		glucose.high_level_Glucose();
		glucose.low_level_Glucose();
		glucose.Balance_level_Glucose();
		

		

	}
}
