package javaPart1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal =  Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));


	}

}
