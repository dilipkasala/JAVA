package practice;

public class SumOfSplitArrays
{
    static int[] arr1 = {1, 1, 1, 2, 1};
    static int[] arr2 = {2, 1, 1, 2, 1};
    static int[] arr3 = {10, 10};
	
	public static void main(String[] args) 
	{
		 System.out.println(split(arr1));
		 System.out.println(split(arr2));
		 System.out.println(split(arr3));
	}
	
	public static boolean split(int[] arr)
	{
		int lSum = 0;
		   
		 for (int i = 0; i < arr.length; i++) 
		 {
		lSum = lSum+arr[i];

		 int rSum = 0;

		 for (int j = arr.length-1; j > i; j--) 
		 {

		 rSum = rSum+arr[j];

		  }

		    if (rSum == lSum)
		      return true;
		  }
		 return false;
		
	}

}
