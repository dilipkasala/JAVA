package practice;

public class SumLimit {

	public static void main(String[] args) 
	{
		int a = 345;
		int b= 67;
		int lena= String.valueOf(a).length();
		int lenb=String.valueOf(b).length();
		//System.out.println(lena);
		//System.out.println(lenb);
		int sum = a+b;
		int lensum=String.valueOf(sum).length();
		if(lensum==lena) 
		{
			System.out.println(sum);
		}
		else if(lensum>lena)
		{
			System.out.println(a);
		}
	}

}
