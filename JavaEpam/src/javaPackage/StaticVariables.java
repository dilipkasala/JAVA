package javaPackage;

public class StaticVariables
{
	
	 int roll;
	 String name="poi";
	 static String college="ITS";
	 static int count=0;
	

		StaticVariables(int r, String n)
	{
		
		  roll = r;  
		   name = n; 
	}
	
	void display()
	
	{
		System.out.println(roll+ "" + name + "" + college);
		
	}
	
	static void counter()
	{
		count++;
		count--;
		--count;
		++count;
		System.out.println(count);
				
	}

	public static void main(String[] args)
	{
		StaticVariables s1 = new StaticVariables(111,"dkk");
		StaticVariables s2= new StaticVariables(222,"pkk");
				
		
		s1.display();
		s2.display();
		counter();

		

	}

}
