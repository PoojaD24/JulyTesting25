package firstCode;

public class PrintStatement {
	
	public static void main (String[] args) {
	
	// "\n"---> new line character
	
	System.out.print("Good"+"/n");
	System.out.print("Morning"+"/n");
	System.out.print("Welcome"+"/n");
	
	System.out.println ("----------");
	
	System.out.println("Good");
	System.out.println("Morning");
	System.out.println("Welcome");
	
	//+ sign in between 2 numbers acts as a arithmetic operator
	System.out.println(10+2);
	System.out.println(10+2.2);
	// between String and number,if+ sign exist then it is treated as concatinating operator(it join)s
	System.out.println("10"+2);
	System.out.println("10"+"2");
	System.out.println("pooja"+"dilip"+"dolare");
	System.out.println("my entire number in pcm"+95+96+85);
	System.out.println("my entire number in pcm"+(95+96+85));
	System.out.println('A'+0);//65
	System.out.println('a'+0);//97
	System.out.println('z'+0);
	System.out.println('Z'+0);
	}

}
