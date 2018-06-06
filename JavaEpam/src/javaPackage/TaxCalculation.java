package javaPackage;

import java.util.Scanner;

public class TaxCalculation {
	
	static int age=0;
	static double income=0;
	static int tax=0;

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Your Age : ");
		age=sc.nextInt();
		System.out.print("\nEnter Your Income : ");
		income=sc.nextDouble();
  
		if(age<60)
		
		{
			if (income<250000)
				
			{
				tax=0;
			    System.out.println("Income tax for this year:" +tax);
							
			}
			
			//if income greater than 5,00,000 and less than 10,00,000
			
			if(income>250000 && income<350000)
				
			{
				
				if( income<=350000)
				{
					
					tax = ((int)(income*5)/1000) - 2500;
					
						
				}
				
				else
				{
					tax = ((int)(income*5)/1000);
					
				}
				
				System.out.println("Income tax for this year:" +tax);
			}
			//if income greater than 5,00,000 and less than 10,00,000
			
			if(income>500000 && income<1000000)
				
			{
				
				if( income>=500000)
				{
					
					tax = ((int)(income*20)/1000) +12500;
					
						
				}
				
				else
				{
					tax = ((int)(income*20)/1000);
					
				}
				
				System.out.println("Income tax for this year:" +tax);
			}
			
		}
		
		// if age is in between 60 to 80
		
		if(age>=60 && age<=80)
			
		{
			if (income<=300000)
				
			{
				tax=0;
			    System.out.println("Income tax for this year:" +tax);
							
			}
			
			if (income>300000 && income <=500000)
				
			{
				
				tax = ((int)(income*5)/1000);
			    System.out.println("Income tax for this year:" +tax);
							
			}
			
			if (income>500000 && income <=1000000)
				
			{
				
				tax = ((int)(income*20)/1000);
			    System.out.println("Income tax for this year:" +tax);
			    
							
			}
			
			if ( income >1000000)
				
			{
				
				tax = ((int)(income*30)/1000);
			    System.out.println("Income tax for this year:" +tax);
							
			}
			
		}
		// If age above 80
		
		
		if(age>=80)
			
		{
			if (income<=500000)
				
			{
				tax=0;
			    System.out.println("Income tax for this year:" +tax);
							
			}
			
			if (income>500000 && income <=1000000)
				
			{
				
				tax = ((int)(income*20)/1000);
			    System.out.println("Income tax for this year:" +tax);
							
			}
			if (income>=1000000)
				
			{
				
				tax = ((int)(income*30)/1000);
			    System.out.println("Income tax for this year:" +tax);
							
			}
		}
		
	}

}
