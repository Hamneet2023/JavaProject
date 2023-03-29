package AssignmentMarch25;

public class OntarioLicence {
	int age;
	
	boolean G1;
	boolean G2;
	boolean G;

	void DrivingLicence() {

		if (age >= 16) {
			
			if(G1) {
				System.out.println("Issue G2");
			}
			else {
				if(G2) {
					System.out.println("Issue G");
				}
				else {
					if(G) {
						System.out.println("you have all the levels what are you looking for:");
					}
				}
			}
		
		} //main if ends here
		
		else {
			System.out.println("you are too young for the licence");
		}
	}// DrivingLicence
}



//if (age >= 16) {
//	  if (knowledgeTest){
//	    System.out.println("You are eligible for a G1 license.");
//	  } else if (G1) {
//	    System.out.println("You are eligible for a G2 license.");
//	  } else if (G2) {
//	    System.out.println("You are eligible for a G license.");
//	  }
//	} else {
//	  System.out.println("You are not eligible for a license yet.");
//	}
//}//DrivingLicence
//}