package practice;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapClass {

	public static void main(String[] args) 
	{
		LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
		
		lhm.put("1", "A");
		lhm.put("3", "C");
		lhm.put("2", "B");
		lhm.put("5", "E");
		lhm.put("4", "D");
		lhm.put("6", "F");
		
		System.out.println(lhm);
		
		System.out.println("This is size of array -" + lhm.size());
		System.out.println("This is to get elements -" + lhm.get("5"));
		System.out.println("This is to check empty - " +lhm.isEmpty());
		System.out.println("This is to get hascode -" +lhm.hashCode());
		System.out.println("This is to check key -" +lhm.containsKey("B"));
		System.out.println("This is to check value -" +lhm.containsValue("B"));
		System.out.println("This is to remove elements -" + lhm.remove("6"));
		
		Set<String> keys = lhm.keySet();
        for(String k:keys)
        {
            System.out.println(k+" -- "+lhm.get(k));
        }
        
       
        
        
		
	
	}

}
