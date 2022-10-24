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
        int k=s.nextInt();
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]+k>=max)
            System.out.print("True"+" ");
            else
             System.out.print("False"+" ");
        }
    }
}