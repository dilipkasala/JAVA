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
	
	public void setName(String name)
	{

		Encapsulation.eName=name;
	}
	
	public void setEID(int ID) 
	{
		Encapsulation.eID=ID;
	}
	
	public void setEexp(int exp)
	{
		Encapsulation.eExp=exp;
	}
	
	public Encapsulation(int ID, String name, int i)
	{ 
		Encapsulation.eID=ID; // constructor this.eID=iD
		Encapsulation.eName=name;  // constructor this.eName=name;
		Encapsulation.eExp=i;  // constructor this.eExp=i
		
	}
	
	public static void main(String[] args) 
	{
		
		Encapsulation encp = new Encapsulation(1012, "Raj", 3);
		int eID = encp.getEID();
		String eName =encp.getName();
		int eEexp =encp.getEexp();
		
		System.out.println("ID :" +  eID  + " Name : " + eName + " Experience :" + eEexp );
		
		
	}
	
}
