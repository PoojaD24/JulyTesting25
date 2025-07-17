package firstCode;

import Variables.GlobalVariables;

public class Orders {
	
	public static void main(String[] args) {
		
		m3();
        //calling static variable of another class from another package
		//className.MethodName for calling static method inside another class
		//className.VariableName
		
		System.out.println("GlobalVariables.schoolName");
	}
	
	public static void m1() {
		
		System.out.println("Running in m1()");
	}
	public static void m2() {
		m1();
		System.out.println("Running in m2()");
	}
		public static void m3() {
			m2();
			System.out.println("Running in m3");
		}

}
