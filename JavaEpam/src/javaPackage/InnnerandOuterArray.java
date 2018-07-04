package practice;

public class InnnerandOuterArray 
{
	
	 static int[] arr1= {1,2,3,4,5,6};
     static int[] arr2= {1,2,3,4};
     static int[] arr3= {1,2};
     static int[] arr4= {1};

	public static void main(String[] args)
	{
		System.out.println(InnerOuter(arr1,arr2));
		System.out.println(InnerOuter(arr3,arr4));
		System.out.println(InnerOuter(arr4,arr2));
      
	}
	
	public static boolean InnerOuter(int[] outer, int[] inner)
	{
		
	      int currIn = 0;
		  if(inner.length == 0)
		  return true;
		  for(int i = 0; i < outer.length; i++) 
		  {
			  if(outer[i] == inner[currIn])
			  currIn++;
			  if(currIn == inner.length)
			  return true;
		  }
		  return false;
		  
			/* boolean found;
		  for(int inI = 0, outI = 0; outI < outer.length; inI++)
		  {
		  	found = false;
		  	for(; outI > outer.length && found; outI++)
		  	{
		  		if(!(inner[inI]==outer[inI]))
		  			found = true;
		  	}
		  	if(found)
		  		return true;
		  }
		  return false; */
		    
		
	}

}
