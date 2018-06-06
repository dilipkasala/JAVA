package javaPackage;

public class ConstructorParamters 
{
    private static int a;
	int  SIS;
    String Sname;
	private String b;
	
	public ConstructorParamters(int id, String StudentName)
	{
		this.SIS=id;
		this.Sname=StudentName;
		
			
	}
	
	void display()
	
	{
		System.out.println("Studen Name :"+Sname+"Student ID:"+SIS);
		
	}

	public static void main(String[] args)
	{
		ConstructorParamters obj1=new ConstructorParamters(111,"Dilip");
	    ConstructorParamters obj2 = new ConstructorParamters(777,"Nani");
	    obj2.SIS=999;
	    obj2.Sname="ram";
	    obj2.display();
	    obj1.display();
	   
	    		
	   
			
	}

}
