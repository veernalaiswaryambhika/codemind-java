import java.util.*;
class automorphic 
{ 
	public static boolean isauto(int x)
	{
		int d=(int)Math.log10(x)+1;
		if((x*x)%(int)Math.pow(10,d)==x)
			return true;
		else 
			return false;
	}
		
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(isauto(n))
			System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");
	}
}