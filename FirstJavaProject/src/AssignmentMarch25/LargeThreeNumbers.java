package AssignmentMarch25;

public class LargeThreeNumbers {

	int n1;
	int n2;
	int n3;

	void LargestNumber() {
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(n1);
			} else {
				System.out.println(n2);
			}

		} else {
			if (n2 > n3) {
				System.out.println(n2);
			} else 
				System.out.println(n3);
		}

	}// function ends here
}
