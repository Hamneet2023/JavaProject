package Airthmetic_Operators;

public class AirthmeticOperators {
	int num1;
	int num2;

	void sumOfNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of num1 and num2 is:" + sum);
	}

	void differenceOfNumbers() {
		int difference = num1 - num2;
		System.out.println("Diff of "+num1+"and"+ num2+ " is:" + difference);
	}

	void ProductOfNumbers() {
		int product = num1 * num2;
		System.out.println("product of num1 and num2 is:" + product);
	}
	
	void DivisionofNumbers() {
		int Division = num1 / num2;
		System.out.println("division operator gives quotient:" +Division);
		
	}
	
	void CheckRemainder() {
		int Remainder = num1 % num2;
		System.out.println("modulus operator gives remainder:" +Remainder);
	}

	
}
