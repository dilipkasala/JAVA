package practice;

public class ClumpsCount 
{
     static int[] arr1= {1, 2, 2, 3, 4, 4};
     static int[] arr2= {1, 1, 2, 1, 1};
     static int[] arr3= {1, 1, 1, 1, 1};
	
	public static void main(String[] args) 
	{
		System.out.println(clump(arr1));
		System.out.println(clump(arr2));
		System.out.println(clump(arr3));
	}
	
	public static int clump(int[] nums)
	{
		
		int clumps = 0;
		boolean isClump = false;
		for(int i = 0; i < nums.length - 1; i++)
		  {
		  	if(isClump)
		  	{
			  	if(nums[i] != nums[i+1])
			  		isClump = false;
			 }
		  	else if(nums[i] == nums[i+1])
		  	{
		  		    isClump = true;
		  		
		  	}
		  	clumps++;
		  }
	 return clumps;

	}
	
}
