package firstPackage;

public class MobilePhone {
	String brandName;
	int modelNumber;
	String operatingSystem;
	int ram;
	int StorageCapacity;
	boolean isCameraPresent;

	void makeCall() {
		System.out.println("making call from " + brandName + "mobile");

	}

	void sendAndReceiveText() {
		System.out.println("sending text from" + brandName + "mobile");
	}

	void takePhoto() {
		System.out.println("Is Camera available to take picture" + isCameraPresent);
	}

}
