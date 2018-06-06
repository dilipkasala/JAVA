package javaPackage;

import java.sql.Date;
import java.util.*;

public class CurrentDateTime {

	public static void main(String[] args) 
	{
		Date d1 = new Date(0);
		System.out.println(d1);
		
		Calendar c =  Calendar.getInstance();
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.getTime());
		 System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println( c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		
	}

}
