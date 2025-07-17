package Methods;

public class ArgumentedMethods {

	public static void main(String[] args) {
		click();
		System.out.println("------------------");
		click("Mobile");
		System.out.println("------------------");
		click(10,20);
	
	}
	public static void click() {
		System.out.println("running in click()");
	}
	public static void click(String WebElement) {
		System.out.println("String WebElement = "+WebElement);
		System.out.println("running in click(String)");
	}
	public static void click(int x,int y) {
		System.out.println("int x="+x);
		System.out.println("int y="+y);

		System.out.println("running in click(int,int)");
	}
	

	}


