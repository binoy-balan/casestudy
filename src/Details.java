package Details;

import java.util.Scanner;

public class Details {
	static Scanner sc=new Scanner(System.in);
	public static int reg=0;
	static int custom[]=new int[25];
	static String nam[]=new String[25];
	
	  static String register(String name) {
		    String a;
		System.out.println("Registered Successfully"+"Register Number is :"+ ++reg); 
		custom[reg-1]=reg;
		nam[reg-1]=name;
		System.out.println("Do you want to continu(yes/no)");
		a=sc.next(); 
		return a; 
		
		}

	  void display()
	  {
		  System.out.print("custom id\t\t");
		  System.out.println("Name");
		  for(int i=0;i<25;i++)
		  {
		   if(custom[i]>0)
		   {
		  	 System.out.print(custom[i]+"\t\t\t");
		  	System.out.print(nam[i]);
		  	System.out.println();
		   }
	  }
}
}
