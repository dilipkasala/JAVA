package practice;

//import java.util.Scanner;

public class SpeedDriving {
	
	

	public static void main(String[] args) 
	
	{
		int s = SpeedDrive(90,true);
		if(s==0)
		{
			System.out.println("No ticket");
		}
		else if(s==1)
		{
			System.out.println("Small ticket");
		}
		else if(s==2)
		{
			System.out.println("Big ticket");
		}
		
	   
	}
	
	public static int SpeedDrive(int speed, boolean isBirthday)
	{
		if(isBirthday)
			speed -= 5; 
		if(speed <= 60)
			return 0;
		else if(speed>=61 && speed <= 80)
			return 1;
		else
	  return 2;
		
		/*
		  static int speed;
	      static boolean isBirthday;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nIs your Birthday : ");
		isBirthday=sc.nextBoolean();
		
		System.out.print("\nEnter Speed: ");
		speed=sc.nextInt();
		
		if(isBirthday==true)
		{
			speed-=5;
			
		}
	    if(speed<=60)
	    {
	      System.out.println("No ticket");
	      
	    }
	    else if(speed>61 && speed<=80)
	    {
	    	System.out.println("Ticket 1");
	    	
	    }
	    else
	    {
	    	System.out.println("Ticket 2");
	    	
	    }*/
	    
	}

}
