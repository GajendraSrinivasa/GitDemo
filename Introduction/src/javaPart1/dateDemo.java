package javaPart1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString());
		
		// to change the format
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));

	}

}
