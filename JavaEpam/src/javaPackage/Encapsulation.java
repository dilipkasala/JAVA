package practice;

public class Encapsulation 
{
   private static String eName;
   private static int eID;
   private static int eExp;
   
	
	// getter values
	
	public String getName()
	{
		
		return eName;
	}
	
	public int getEID()
	{
		return eID;
		
	}

	public int getEexp()
	{
		return eExp;
	}
	
	// setter values
	
	public void SetName(String name)
	{

		this.eName=name;
	}
	
	public void SetEID(int ID) 
	{
		this.eID=ID;
	}
	
	public void SetEexp(int exp)
	{
		this.eExp=exp;
	}
	
	public Encapsulation(int ID, String name, int i)
	{
		this.eID=ID;
		this.eName=name;
		this.eExp=i;
		
	}
	
	public static void main(String[] args) 
	{
		
		Encapsulation encp = new Encapsulation(1012, "Raj", 3);
		int EID = encp.getEID();
		String Ename =encp.getName();
		int Eexp =encp.getEexp();
		
		System.out.println("ID :" +  EID  + " Name : " + Ename + " Experience :" + Eexp );
		
		
	}
	
}
