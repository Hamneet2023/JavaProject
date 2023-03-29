package assignmentsEclipse;

public class Assignments {

	// 1) Given two numbers, divide first number by second number and provide the
	// quotient and
	// remainder of the numbers. a= 2, b=3;
	int a, b;

	void quotient() {
		int c = a / b;
		int d = a % b;
		System.out.println("Quotient and Remainder of these two numbers is:");
		System.out.println("Remainder is:" + c + " " + "Quotient is:" + d);
	}

	// 2)what is the output of program
//	double a = 25.64;
//	int b = 25;
//	a = a % 10;
//	b = b % 10;
//	c

	double c;
	int d;

	void result() {
		double a = c % 10;
		int b = d % 10;
		System.out.println(
				"when datatype is float 25.64 % 10 the remainder is: and  when datatype is int 25%10 the remainder is:");
		System.out.println("Remainder is:" + a + " " + "Quotient is:" + b);
	}
	

//	 4)What is the output of the Java code snippet?
//			 int a=5, b=10, c=15 ,d=50;
//			 a -= 3;
//			 b *= 2;
//			 c /= 5;
//			 d %=3
//			 System.out.println(a +" " + b + " " + c);
	
	int e; int f; int g; int h;

	void result2() {
		System.out.println("before intializing:" +e+" "+f+" "+g+" "+h);
		 e -= 3; 
		 f *= 2;
		 g /= 5;
         h %= 3;
		 System.out.println(e+" "+f+" "+g+" "+h);
		 
		 System.out.println("before intializing: "+a +" " +b+" " +c+" " +d);
		 a -= 3;
		 b *= 2;
		 c /= 5;
         d %= 3;
		 System.out.println(a +" " +b+" " +c+" " +d);
		 
	}
	
	

// Find square of a number using multiplication assignment operator.
//E.g Square of 6 is 36.
	
	int s;
	void Square(){
		s *= s; //s=s*s
		 System.out.println(s);
		
	}
	
	
}


