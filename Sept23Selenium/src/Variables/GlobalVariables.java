package Variables;

public class GlobalVariables {
	
	//Global variables
	public static String schoolName = "Jain international school,Bilaspur";//static variables
	int rollNumber = 908; //nonstatic variables //instance variable

	public static void main(String[] args) {
		
		System.out.println("main method =>" + schoolName);
		//oject creation
		//className obj = new className();
		
		GlobalVariables obj = new GlobalVariables();
		
		obj.m1();
		System.out.println(obj.rollNumber);
		System.out.println(obj);
		//to call non static variables-we need objects
		//objects are the the virtual copy,
		//object creation syntax;
		
	}
		
	public void m1() {
		System.out.println(rollNumber);
		System.out.println("non static m1 method =>"+schoolName);

}
	
}