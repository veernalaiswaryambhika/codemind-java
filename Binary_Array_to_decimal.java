import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            
        }
        int p=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=(int)Math.pow(2,p)*a[i];
            p++;
        }
        System.out.print(sum);
        
    }
}