package practice;

class SumParent 
{
	int a=10;
	int b=20;
	int s=0;
	
	   public void sum() 
	   {
		   s=a+b;
	      System.out.println("Sum of two number from parent class" + s);
	   }
}

	class SumChild extends SumParent 
	{
		 int a=40;
	      int b=50;
	      
	   public void sum()
	   {
		     
		      s=a-b; // override the method
		      System.out.println("Sum of two number from Child class" + s);
	   }
	   
	   public void mul() 
	   {
		   s=a*b;
	      System.out.println("Product of two number from Child class" + s);
	   }
	}

public class Overriding2 
{

	public static void main(String[] args) 
	{
		
		SumChild c = new SumChild();
		c.sum();
		c.mul();
		
		SumParent p= new SumParent();
		p.sum();
		
		SumParent r = new SumChild();
		r.sum();
		//((SumChild) r).mul();
			
	}

}


