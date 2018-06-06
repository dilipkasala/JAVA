package javaPackage;

public class DerivedClass {

	public static void main(String[] args)
	{
		//Developer dev= new Developer(10, "Raj","Java", 1);
		//dev.Display();
		//		System.out.println("\n*************************");
		
		Designation dig= new Designation(10,"Dilip","Net",3,"MD","Medical Science");
		dig.Display();

	}

}

class Employee{
	int empId;
	String empName;
	
	//Default constructor
	public Employee()
	{
		System.out.println("\nEmployee Default constructor");
	}
	
	//Parameterized constructor
	public Employee(int id, String name)
	{
		empId=id;
		empName=name;
	}
	
	/*public void Display()
	{
	    System.out.printf("\nEmployee Id:%d\nEmplyee Name:%s",empId, empName);
	}
	*/
}

class Developer extends Employee
{
	String tech;
	int experience;
	
	public Developer (int id, String name,String techno, int exp)
	{
		super(id, name);
		tech=techno;
		experience=exp;
	}

	public void Display()
	{
        System.out.printf("\nEmployee Id:%d\nEmplyee Name:%s",empId, empName);
	    System.out.printf("\nSpecialized in:%s\nExperience %d",tech, experience);
	}
	
}

class Designation extends Developer
{
	String Designation;
	String Description;
	
	public Designation(int id, String name,String techno, int exp, String Desig, String Desc)
	
	{
		super (id,name,techno,exp);
		Desig=Designation;
		Desc=Description;
					
	}
	
	public void Display()
	{
        System.out.printf("\nEmployee Id:%d\nEmplyee Name:%s",empId, empName);
        System.out.printf("\nSpecialized in:%s\nExperience %d",tech, experience);
        System.out.printf("\nDesingnation:%s\nDescription %d",Designation, Description);
	    //System.out.printf("\nSpecialized in:%s\nExperience %d",Designation,Description);
	    
	}
	

}

