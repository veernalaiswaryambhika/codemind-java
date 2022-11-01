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
        int min=a[0];
         for(int i=1;i<n;i++)
         {
             if(a[i]<a[0])
             min=a[i];
         }
         System.out.print(min);
        
    }
}