package javaPackage;

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers 
{

	public static void main(String[] args)
	{
		int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }
		
	}

}
