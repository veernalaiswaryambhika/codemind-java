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
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
             f=1;
        }
        if(f==1)
         System.out.print("False");
         else
         System.out.print("True");
        
    }
}