import java.util.*;
class Sample
{
    public static boolean isprime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isprime(n))
        {   int r=0;
        int rev=0;
            while(n!=0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
                
            }
            if(isprime(rev))
            System.out.print("circular prime");
            else
            System.out.print("prime but not a circular prime");
            
        }
        else
        System.out.println("not prime");
    }
}