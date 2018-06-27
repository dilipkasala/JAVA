package practice;

public class GreaterNumber {

	public static void main(String[] args)
	{
	    System.out.println(Numbers(1, 2, 10, true));
		System.out.println(Numbers(1,2,4,false));
		System.out.println(Numbers(1,2,1,false));
		System.out.println(Numbers(1,1,2,true));

	}
	public static boolean Numbers(int a, int b, int c, boolean bOk)
	{
		if(bOk)

		   {
			   
			   if(c>b)
				   return true;
			   
		  }
			  
       else
			  {
			      if(b>a && c>b)
				   return true;
			   
			  }

     return false;
			  
			  
	 }
		
						
}


