import java.util.*;
class Sammple
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        
      
        for(int i=0;i<n;i++)
        {
        a[i]=s.nextInt();
        
        }
        int k=s.nextInt();
        int f=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]==k)
             {
             f=1;
             break;
             }
         }
      if(f==1)
        System.out.print("True");
        
        else
         System.out.print("False");
        
    }
}