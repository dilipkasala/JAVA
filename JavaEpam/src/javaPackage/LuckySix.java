package practice;

public class LuckySix {

	public static void main(String[] args)
	{
		
		System.out.println(Six(7,13));

	}
	
	public static boolean Six(int a, int b)
	{
		
		if ((a==6)||(b==6))
		{
			//System.out.println("1");
			return true;
		}
		else if((a+b==6) || Math.abs(a-b)==6)
		{
			//System.out.println("2");
			return true;
		}
		return false;
	}

}
