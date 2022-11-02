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
            sum+=a[i];
        }
        int avg=(int)Math.floor((float)sum/n);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=avg)
                c++;
        }
        System.out.print(c);
        
    }
}