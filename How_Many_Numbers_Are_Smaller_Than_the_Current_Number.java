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
        for(int i=0;i<n;i++)
        {   int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j&&a[i]>a[j])
                c++;
                
            }
            System.out.print(c+" ");
        }
    }
}