import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int c=0;
        for(int i=0;i<n-2;i++)
        {
            if((a[i]%2==0&&a[i+2]%2!=0)||(a[i]%2!=0&&a[i+2]%2==0))
            {
            c++;
            }
        }
        System.out.print(c);
    }
}