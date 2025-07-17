package Methods;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReturnType {

	public static void main(String[] args) {
		
		String dateForToday=getCurrentDate();
		System.out.println(dateForToday);

	}
	public static void m1() {
	return;	//default return statement
	}
	
	public static String getCurrentDate() {
		//logic to get the current date
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy")
				.format(Calendar.getInstance().getTime());
		   
		
	return timeStamp;
	}

}
