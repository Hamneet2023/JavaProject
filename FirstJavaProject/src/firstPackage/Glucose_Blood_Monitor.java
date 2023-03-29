package firstPackage;

public class Glucose_Blood_Monitor {
	
String BrandName;
int Batteries;	
boolean blood_Sample;
boolean blood_Strip;
String  color;


void high_level_Glucose() {
	System.out.println("to check blood glucose level,we need blood sample ," + blood_Sample);
}
void low_level_Glucose() {
	System.out.println("to check blood glucose level, we need blood Strip ,which we will insert into machine," + blood_Strip);
}
void Balance_level_Glucose() {
	System.out.println("Glucose is balanced then marked as color," +color);
}

}