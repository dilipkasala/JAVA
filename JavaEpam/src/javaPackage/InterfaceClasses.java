package practice;

import java.util.Scanner;

interface InterfaceParent
{
	int a=0, b=0, s=0;
	abstract void input(); // method without implementation and need to override
    abstract void add(); // method without implementation and need to override
    abstract void result(); // method without implementation and need to override
    Scanner sc = new Scanner(System.in);
}

class Interfacechild implements InterfaceParent
{
	@Override
	public void input() 
	    {
		 int a=10;
		 int b=20;
	    }

	@Override
	public void add() {
		
		int s=a+b;
	}

	@Override
	public void result() 
	{
		System.out.println("Sum of numbers" + s);
		
	}
}

public class InterfaceClasses 
{

	public static void main(String[] args)
	{
		Interfacechild ic = new Interfacechild();
		ic.input();
		ic.add();
		ic.result();
				
	}

}
