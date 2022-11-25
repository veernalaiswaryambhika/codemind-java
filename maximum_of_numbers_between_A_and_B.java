
import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,n,i,max,f=0;
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=s.nextInt();
        a=s.nextInt();
        b=s.nextInt();
        max=a;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                    f++;
                }
            }
        }
        if(f!=0)
            System.out.println(max);
        else
            System.out.println(-1);
    }
}
