package basic;
import java.util.Scanner;
public class Form
{
	private
	 String name;
	 String address;
	 Long contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 static int reg=0;
	 public Form(String name,String address,Long contactNumber,String email,String proofType, String proofID)
	 {
        
	   this.name=name;
	   this.address=address;
	   this.contactNumber=contactNumber;
	   this.email=email;
	   this.proofType=proofType;
	   this.proofID=proofID;
	 }
	 public Form() {
		// TODO Auto-generated constructor stub
	}
	String Register()
	{
		 Scanner sc=new Scanner (System.in);
		String a;
	    System.out.print("Thank you for registering.your id is : "+ ++reg+ "\n" );
	    System.out.println("Do you want to continu (yes/no)?");
	    a=sc.next();
	    
	    return a;
	}
	void email()
	{
		Scanner sc=new Scanner (System.in);
		 System.out.println("Do you want to edit Email id (yes/no)?");
       String a=sc.next();
       if(a.contentEquals("yes"))
       {
    	   System.out.println(" Enter new Email id");
    	   this.email=sc.next();
       }
	}
void display()
{
	System.out.println("name:"+name);
	System.out.println("address:"+address);
	System.out.println("contactNumber:"+contactNumber);
	System.out.println("Email:"+email);
	System.out.println("proofType:"+proofType);
	System.out.println("proofID:"+proofID);
}
	}



  