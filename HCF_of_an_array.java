

import java.util.*;
class sol
{
    public static int gcd(int a,int b)
    {
        int res=0;
        while(b>0)
        {
            int temp=b;
            b=a%b;
            a=temp;
            res=a;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int result=gcd(a[0],a[1]);
        for(int i=2;i<n;i++)
            result=gcd(result,a[i]);
        System.out.println(result);
    }
}
