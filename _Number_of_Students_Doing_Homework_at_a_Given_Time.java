import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
          int n1=s.nextInt();
         int a1[]=new int[n1];
        for(int i=0;i<n;i++)
        a1[i]=s.nextInt();
        int t=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
           if(t>=a[i]&&t<=a1[i])
                c++;
         }
       System.out.print(c);
    }
}