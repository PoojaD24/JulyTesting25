package Methods;

public class IAmConstructor {
	
  public IAmConstructor () {
	  System.out.println("running in zero argumented IAmConstructor()");
	  
  }
 public IAmConstructor (String name) {
	 System.out.println("running in String argumented IAmConstructor (string)");
	  
  } 
 public IAmConstructor (int a) {
	 System.out.println("running in int argumented IAmConstrucor(int)");
	  
  }
 public IAmConstructor (boolean status) {
	 System.out.println("running in boolean argumented IAmConstructor(boolean)");
	  
  }
	public static void main(String[] args) {
	IAmConstructor obj1= new IAmConstructor () ;//call to constructor
	IAmConstructor obj2= new IAmConstructor ("edureka") ;//call to constructor
	IAmConstructor obj3= new IAmConstructor (true) ;//call to constructor
	}

}
