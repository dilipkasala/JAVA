package javaPackage;

import java.io.File;

public class StringOpertors {
	
	static String  xlpath = "ahm_cr_d05_Croatan_Jan2015.xls";

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		int position = xlpath.indexOf(".");
		
		System.out.print("\n this is postion of file"+" "+position);
		
		String filetype = xlpath.substring(position);
		
		System.out.print("\n file format "+ filetype);
		
		if(filetype.equals(".xls")) 
		System.out.println("\n file foramt is 2003");
				else  if(filetype.equals("xlsx"))
		System.out.println("\n file foramt is 2007");
			else 
				System.out.println("\n incorrect format");
		
						

	}
	

	}

