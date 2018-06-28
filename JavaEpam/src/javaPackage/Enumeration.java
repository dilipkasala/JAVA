package practice;

enum Days
{
	//RED,BLUE,GREEN,PINK;
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY;
}

public class Enumeration 
{
	Days day;
	
	//Call constructor
	public Enumeration(Days day)
	{
		this.day=day;
	}
	
	//Create method
	
	public void displaydays()
	{
		switch(day)
		{
		
		case SUNDAY:
			System.out.println("this is first day");
			break;
			
		case MONDAY:
			System.out.println("this is second day");
			break;
			
		case TUESDAY:
			System.out.println("this is third day");
			break;
			
		case WEDNESDAY:
			System.out.println("this is forth day");
			break;
			
		case THURSDAY:
			System.out.println("this is fifth day");
			break;
			
		case FRIDAY:
			System.out.println("this is sixth day");
			break;
			
		case SATURDAY:
			System.out.println("this is seventh day");
			break;
		
		}
		
	}

	public static void main(String[] args) 
	{
		
		
				
		//Color E = Color.RED;
		//System.out.println(E);
				
		/*for(Days d:Days.values())
		{
			System.out.println(d);
			
		}*/
		
		Enumeration s = new Enumeration(Days.SUNDAY);
		s.displaydays();
		
		Enumeration m = new Enumeration(Days.MONDAY);
		m.displaydays();
		
		Enumeration t = new Enumeration(Days.TUESDAY);
		t.displaydays();
		
		Enumeration w = new Enumeration(Days.WEDNESDAY);
		w.displaydays();
		
		Enumeration th = new Enumeration(Days.SUNDAY);
		th.displaydays();
		
		Enumeration f = new Enumeration(Days.SUNDAY);
		 f.displaydays();
		 
		 Enumeration sat = new Enumeration(Days.SUNDAY);
		 sat.displaydays();
	
		
		
		
		

		
	}

	

}
