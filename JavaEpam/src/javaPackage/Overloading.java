package practice;

public class Overloading 
{
    static int EID;
    static String Ename;
    static String Etitle;
    static int Eexp;
	
	public static void main(String[] args) 
	{
		Display(101,"Dilip","Ms");
		Display(103,"Raj","Ms",3);
		Display(102,"Sri");
	}
	
	public static void Display(int IDs,String name)
	{
		EID=IDs;
		Ename=name;
		System.out.println("this is from first classs -" + EID +","+ Ename);
		
	}
	
	public static void Display(int IDs,String name,String title)
	{
		
		  EID = IDs;
		  Ename=name;
		  Etitle = title;
		  System.out.println("this is from second classs - " + EID +","+ Ename +","+ Etitle);
	}
	
	public static void Display(int IDs,String name,String title,int exp)
	{
		  EID = IDs;
		  Ename=name;
		  Etitle = title;
		  Eexp=exp;
		  System.out.println("this is from third classs -" + EID +","+ Ename +","+ Etitle +","+ Eexp);
		
	}

}
