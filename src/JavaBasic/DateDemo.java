package JavaBasic;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(LocalDate.now());
		System.out.println(sd.format(d));
		
		Calendar cl=Calendar.getInstance();
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cl.get(Calendar.AM_PM));

	}

}
