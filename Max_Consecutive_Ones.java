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
        int c=1;
        int max=0;
        for(int i=0;i<n-1;i++)
        {  
            if(a[i]==1)
        {
           if(a[i]==a[i+1])
           c++;
           else
           c=1;
           if(c>max)
           max=c;
        }
        
        }
        System.out.print(max);
    }
}