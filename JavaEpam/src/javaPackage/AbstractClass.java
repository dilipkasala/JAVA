package practice;

import java.util.Scanner;

abstract class AbstractParent
{

    int a, b, s;
   
    void input() // method with implementation
    {
	 a = 10;
	 b=20;
    }
    abstract void add(); // method without implementation and need to override
    abstract void result(); // method without implementation and need to override
    Scanner sc = new Scanner(System.in);
       
}

class AbstractChild extends AbstractParent
{
	
		
	@Override
	void add() 
	{
		s=a+b;
		
	}

	@Override
	void result() 
	{
		System.out.print("\nThe Sum of Two Numebrs is :" + s);
		
	}
	
}

class AbstractClass
{
	
		
	public static void main(String[] args)
	{
		AbstractChild ac = new AbstractChild();
		
		ac.input();
		ac.add();
		ac.result();
				
	}
	

}
