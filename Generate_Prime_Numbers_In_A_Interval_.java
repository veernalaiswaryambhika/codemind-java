import java.util.*;
class sample
{  public static boolean isprime(int n)
{
    if(n==1)
        return false;
    for(int i=2;i<=Math.sqrt(n);i++)
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
        int m=s.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(isprime(i))
                System.out.println(i);
        }
    }
}