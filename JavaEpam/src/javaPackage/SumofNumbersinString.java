package practice;

public class SumofNumbersinString {

	public static void main(String[] args) 
	{
		
		System.out.println(Sum("sd9jkg6"));

	}
	
	public static int Sum(String str)
	{
		  
	      int sum = 0;
	    for (int i = 0; i < str.length(); i++)
	     {
	      char a = str.charAt(i);
	      if (Character.isDigit(a))
	      {
	        int b = Integer.parseInt(String.valueOf(a));
	        sum = sum + b;
	      }
	     }
	    if (sum == 0) 
	    {
	      return -1;
	    }
	    else
	      return sum;
	  }
		
	}


