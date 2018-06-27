package practice;

public class Party 
{
	public static void main(String[] args) 
	{
	   System.out.println(teaParty(6, 8)); // (6,8) returns 1 ; (20, 6) returns 2 ; (3,8) returns 0;
	}
	
	public static int teaParty(int tea, int candy)
	{
		if(tea < 5 || candy < 5)
			return 0;
		else if(candy >= tea*2 || tea >= candy*2)
			return 2;
		return 1;
	}
	
	
	
}
