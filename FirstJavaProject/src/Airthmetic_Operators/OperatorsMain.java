package Airthmetic_Operators;

public class OperatorsMain {
	public static void main(String[] args) {
		AirthmeticOperators alu = new AirthmeticOperators();

		alu.num1 = 5;
		alu.num2 = 10;
		alu.sumOfNumbers();
		alu.differenceOfNumbers();
		alu.ProductOfNumbers();
		alu.DivisionofNumbers();
		alu.CheckRemainder();
		
	System.out.println("------------------");
	
		alu.num1 =4;
		alu.num2 =2;
		alu.DivisionofNumbers();
		alu.CheckRemainder();
		
		alu.num1 =9;
		alu.num2 =2;
	    alu.DivisionofNumbers();
		alu.CheckRemainder();
		
		System.out.println("Assignment operator");
		AssignmentOprator assign = new AssignmentOprator();
		assign.addEqualto();
		assign.minusEqualto();
		
		System.out.println("**********   Assignment 24 march 2023 ***********");
		
		
	}
}
