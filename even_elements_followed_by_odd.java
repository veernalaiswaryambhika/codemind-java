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
         int ar[]=new int[n];
         int j=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]%2==0)
             {
                 ar[j]=a[i];
                 j++;
                
             }
         }
            for(int i=0;i<n;i++)
         {
             if(a[i]%2!=0)
             {
                 ar[j]=a[i];
                 j++;
             }
             
         }
         for(j=0;j<n;j++)
         System.out.print(ar[j]+" ");
    }
}