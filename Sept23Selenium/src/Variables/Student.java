package Variables;

public class Student {
  static String schoolName=("jain international school");
  String name;
  int rollNum;
	public static void main(String[] args) {
		studentData();
	}
	public static void studentData() {
		Student s1=new Student();
		s1.name="vaishnavi";
		s1.rollNum=101;
		System.out.println(schoolName);
		System.out.println(s1.name);
		System.out.println(s1.rollNum);
		System.out.println("-------------");
		
		Student s2=new Student();
		schoolName="dave public school";
		s2.name="saril";
		s2.rollNum=102;
		System.out.println(schoolName);
		System.out.println(s2.name);
		System.out.println(s2.rollNum);
		System.out.println("-------------");
		
		Student s3=new Student();
		s3.name="pooja";
		s3.rollNum=103;
		System.out.println(schoolName);
		System.out.println(s3.name);
		System.out.println(s3.rollNum);
		System.out.println("-------------");
		
		
	}
		
		

	

}
