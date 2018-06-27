package practice;

public class Inheritance 
{

		public static void main(String[] args)
	{
		
		Developer dev= new Developer(10, "Dilip","Java", 1);
		dev.Display();
		
		Employee emp = new Employee(11,"Raj");
		emp.Display();

	}

}

class Employee{
	int empId;
	String empName;
	
	
	public Employee()
	{
		System.out.println("\nEmployee Default constructor");
	}
	
	
	public Employee(int id, String name)
	{
		empId=id;
		empName=name;
	}
	
	public void Display()
	{
	    System.out.printf("\nEmployee Id:%d\nEmplyee Name:%s",empId, empName);
	}
	
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
