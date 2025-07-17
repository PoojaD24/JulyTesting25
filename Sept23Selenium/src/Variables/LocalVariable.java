package Variables;

class LocalVariable {

	public static void main(String[] args) {
		//Local variable/temporary variable
		int a;//decleration
		a = 300;//initialization
		System.out.println(a);//utilization
		
		//Decleration and initialization in single line
		int b = 400;
		System.out.println("b =" + b);
		
//static boolean status = True; //Illegal modifier for parameter status; only final is permitted
		
		final double pie = 3.147;// only final is permitted in local and global variables
		
		//Line # 996
		//pie = 3.1459;//reassignment of a value to a variable
		
		}
	public static void m1() {
		//scope of pie variable is only within the method in which it has been declared
		//System.out.println(pie);//pie can not be resolved to a variable
	}
}
