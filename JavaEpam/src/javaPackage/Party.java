package practice;

public class Party {

	public static void main(String[] args) 
	{
		//System.out.println(Snacks(11,6));
		
		int p =Snacks(17,6);
		if(p==0)
		{
			System.out.println("Party was bad");
		}
		if(p==1)
		{
			System.out.println("Party was good");
		}
		if(p==2)
		{
			System.out.println("Party was great");
		}
	}
	
	public static int Snacks(int tea, int candy)
	{
		
		if((tea<5)||(candy<5))
		{
			return 0;
		}
		if ((tea>candy*2)||(candy>tea*2))
		{
			return 1;
		}
		else return 2;
			
	}

}
