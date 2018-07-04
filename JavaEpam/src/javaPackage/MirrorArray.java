package practice;

public class MirrorArray 
{

	 static int[] arr1= {1, 2, 3, 8, 9, 3, 2, 1};
     static int[] arr2= {1, 2, 1, 4};
     static int[] arr3= {7, 1, 2, 9, 7, 2, 1};
	
	public static void main(String[] args) 
	{
		System.out.println(Mirror(arr1));
		System.out.println(Mirror(arr2));
		System.out.println(Mirror(arr3));

	}
	
	public static int Mirror(int[] arr)
	{
		int span;
		int maxSpan = 0;
		int left;
		int right;
		for(int i = 0; i < arr.length; i++)
		{
			left = i;
			right = lastIndexOf(arr, arr[i], arr.length - 1);
			while(right != -1)
			{
				span = 0;
				left = i;
				do
				{
					left++;
					right--;
					span++;
				}	while(left < arr.length && right >= 0 && arr[left] == arr[right]);
				if(span > maxSpan)
					maxSpan = span;
				right = lastIndexOf(arr, arr[i], right);
			}
		}
	return maxSpan;
		
	}
	
	public static int lastIndexOf(int[] nums, int value, int index)
	{
		for(; index >= 0; index--)
		{
			if(nums[index] == value)
				return index;
		}
		return -1;
	}

}
