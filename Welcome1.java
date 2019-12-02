package basic;
	import java.util.Scanner; 
	public class Welcome1 {
		public static void main(String args[])
		{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int c=0;
		String s="WELCOME";
		char b[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		
		 if(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
		 {
			 System.out.print("*"+b[i]);
			 c=c+1;
		 
		for(i=0;i<c;i++)
		{
			System.out.print("*");
		}
		 }
		else
		{
			System.out.print(b[i]);
		}
		}
	}
	}



