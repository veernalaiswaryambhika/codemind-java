import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        long sum[]=new long[n];
        for(int i=0;i<n;i++)
        
            a[i]=s.nextInt();
            for(int i=0;i<n;i++)
            sum[i]=a[i]*a[i];
        
        Arrays.sort(sum);
        for(int i=0;i<n;i++)
            System.out.print(sum[i]+" ");
    }
}