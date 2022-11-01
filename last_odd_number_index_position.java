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
        int m=0;
         for(int i=n-1;i>=0;i--)
         {
             if(a[i]!=0)
             {
             m=i;
             break;
             }
         }
         System.out.print(m);
        
    }
}