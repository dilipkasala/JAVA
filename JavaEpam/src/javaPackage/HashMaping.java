package javaPackage;
import java.util.*;  

public class HashMaping {

	 static HashMap map = new HashMap();  
	 
	public static void main(String[] args) {
		
	         
		   map.put(101,"Let us C");  
		   map.put(102, "Operating System");  
		   map.put(103, "Data Communication and Networking");  
		   
		   System.out.println("Values before remove: "+ map); 
		   
		   // Remove value for key 102  
		   map.remove(102);  
		   System.out.println("Values after remove: "+ map); 
		   
		   map.get(103);
		   System.out.println("get hash value: "+ map); 
		   
		   map.replace(103, "This is cloud OS");
		   System.out.println("this is repalce statemetn"+map);
		   
		
	}
	  

	}

