package basic;
import java.io.IOException;
import java.util.Scanner;

public class Book {
	
	public static void main(String args[]) throws IOException
	{
	String ac="null";
	String cot="null";
	String cable="null";
	String wifi="null";
	String laundry="null";
	while(true)
	{
		System.out.println("1-book 2-Status 3-exit");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Booking obj=new Booking();
		switch(a)
		{
		case 1: obj.book(ac, cot, cable, wifi, laundry);
		break;
		case 2:
			obj.res();
		break;
		case 3:
			obj.Exit();
		
		}
	}
	}
	

}
 