import java.util.*;
class sol
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
    public static boolean ispalin(int n)
    {
        int f=0;
        int d=(int)Math.log10(n);
        
        while(n!=0)
        {
            if(n/(int)(Math.pow(10,d))!=n%10)
            {
                f=1;
                break;
            }
            n=n%(int)Math.pow(10,d);
            n=n/10;
            d=d-2;
        }
        if(f==0)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n+1;;i++)
        {
            if(isprime(i) && ispalin(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}