package practice;

public class ShareDigits {

	public static void main(String[] args) 
	{
		System.out.println(Digits(56,46));

	}
	
	public static boolean Digits(int a, int b)
	{
		int c = a%10;
		int d=b%10;
		int e=a/10;
		int f=b/10;
		System.out.println(c + "," + d);
		System.out.println(e + "," + f);
		if((e==f)||(e==c)||(c==f)||(c==d))
		{
		return true;
		}
		return false;
	}
	

}
