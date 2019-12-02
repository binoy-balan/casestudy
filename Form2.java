package basic;
import java.util.Scanner;
public class Form2 {
	public static void main(String args[]) 
	{
	 String name;
	 String address;
	 Long contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	String a;
	do
	{
	 Scanner s=new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your name");
	     name=s.nextLine();
	     System.out.println("Enter your address");
	     address=s.nextLine();
	     System.out.println("Contact Number");
	     contactNumber=s.nextLong();
	     System.out.println("E-Mail ID");
	     email=s.next();
	     System.out.println("Enter proof type");
	     proofType=s.next();
	     System.out.println("Enter proof id");
	     proofID=s.next();
	Form  obj=new Form(name,address,contactNumber,email,proofType,proofID);
	a=obj.Register();
	}
	while(a.equals("yes"));
	Form  obj=new Form(name,address,contactNumber,email,proofType,proofID);
	//Form  obj=new Form();
	obj.email();
	obj.display();
	}
}
