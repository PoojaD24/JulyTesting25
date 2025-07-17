package firstCode;

public class Oreo {
	//variables = states,properties
	String name ="Oreo";
     int age = 3;
     
    //call method for all of the existing method
	public static void main(String[] args) {
	   //method call
		eat();
		beout();
		play();
     
	}
	//method = action
    public static void eat() {
    	//method implementation
    	System.out.println("Running in eat()");
    }
    public static void play() {
    	System.out.println("Running in play()");
    }
    public static void beout() {
    	System.out.println("Running in be out()");
    }
    
    }

