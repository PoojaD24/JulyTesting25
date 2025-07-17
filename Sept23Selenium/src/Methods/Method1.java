package Methods;

public class Method1 {

	public static void main(String[] args) {
		//calling static method
		m1();
		m2();
		m3();
		System.out.println("------------");
		
		Method1 ref = new Method1();
		
		ref.m4();//calling nonstatic method
	}
public static void m1() {
	System.out.println("running in m1");
}
public static void m2() {
	System.out.println("running in m2");
}
public static void m3() {
	System.out.println("running in m3");
	
}
public static void m4() {
	System.out.println("running in m4");
	
}
}
