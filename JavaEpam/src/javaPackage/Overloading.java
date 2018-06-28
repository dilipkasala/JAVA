package practice;

public class Overloading 
{
    static int eID;
    static String eNname;
    static String eTitle;
    static int eEexp;
	
	public static void main(String[] args) 
	{
		Display(101,"Dilip","Ms");
		Display(103,"Raj","Ms",3);
		Display(102,"Sri");
	}
	
	public static void Display(int IDs,String name)
	{
		eID=IDs;
		eNname=name;
		System.out.println("this is from first classs :" + eID +","+ eNname);
		
	}
	
	public static void Display(int IDs,String name,String title)
	{
		
		  eID = IDs;
		  eNname=name;
		  eTitle = title;
		  System.out.println("this is from second classs : " + eID +","+ eNname +","+ eTitle);
	}
	
	public static void Display(int IDs,String name,String title,int exp)
	{
		  eID = IDs;
		  eNname=name;
		  eTitle = title;
		  eEexp=exp;
		  System.out.println("this is from third classs :" + eID +","+ eNname +","+ eTitle +","+ eEexp);
		
	}

}
