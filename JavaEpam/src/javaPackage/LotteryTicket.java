package practice;

public class LotteryTicket {

	public static void main(String[] args) 
	{
		System.out.println(Lottery(15,0,5));

	}
	
	public static int Lottery(int a, int b, int c)
	{
		int ab = a+b;
		int bc=b+c;
		int ca=c+a;
		if((ab==10)||(bc==10)||(ca==10))
		{
			return 10;
		}
		
		if ((ab==bc+10) || (ab==ca+10))
		{
			return 5;
		}
		return 0;
	}

}
