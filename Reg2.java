package basic;


	import java.io.IOException;
	import java.util.Scanner;
	//  import sampleswing.Email;
	public class Reg2 {
		
		public static void main(String args[]) throws IOException {
			String name;
			String address;
			Long contactno;
			String emailid;
			String proof;
			String proofid;
			String a;
			String d;
			do
			{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your name");
			     name=s.next();
			System.out.println("Enter your address");
			address=s.next();
			System.out.println("Enter your Contact Number");
			    contactno=s.nextLong();
			System.out.println("Enter your E-Mail ID");
			emailid=s.next();
			System.out.println("Enter your proof type");
			proof=s.next();
			System.out.println("Enter your proof ID");
			proofid=s.next();
			a=Details.register(name);
			}
			while(a.equals("yes"));
			Details obj= new Details();
			obj.display();
			
	}


}