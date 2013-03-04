package com.example.persondb;

public class DSFactory
{
	private static IDS ds;

	public static IDS getInstance(String str)
	{
		 if(str.equals("db"))
		 {
			 ds=new DS_DB();
		 }
		 else
		 {
			 throw new IllegalArgumentException();
		 }
		 return ds;
	}

}
