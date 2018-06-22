package practice;

public class GreaterNumber {

	public static void main(String[] args)
	{
	System.out.println(Numbers(1, 2, 10, true));

	}
	public static boolean Numbers(int a, int b, int c, boolean bOk)
	{
		if(bOk)
		{
			if(c > b)
		    {
			
			    if (b > a && c > b)
				    {
				    	return true;
				    }
		    }
		}
		return false;
		
		/* 
		 if(bOk)
		 return (c > b);
         return (b > a && c > b);
		 */
				
	}

}
