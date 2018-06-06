package javaPackage;
import java.util.Arrays;
import java.util.Collections;



public class ArraysSort {
	
public static void main(String[] args) 
     {
		
	int[] arr = {7,10,1,9,4,5,6,10,7,5,7,3,9,4,10,10,7,5,4,8,10,1,8,8};

	System.out.printf("Array before sorting: %s", Arrays.toString(arr));
	
	Arrays.sort(arr,0,5);
		System.out.printf("\n Arrays after sorting: %s",  Arrays.toString(arr));
	
	int[] arr2 = {8,5,6};
	
	//Arrays.sort(arr2,Collections.reverseOrder());
	System.out.printf("\n Arrays descending sorting: %s",  Arrays.toString(arr));
		
	String[] arrs = {"anil", "nandu", "eros", "dilip"};

	
	 arrs[1]=arrs[arrs.length-1];
	 //arrs[2]=arrs[arrs.length-1];
	System.out.printf(arrs[1], arrs[1]);
	
	
	
	
	//Dynamic arrays
	
	

		

	}

}
