import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,n,i,min,f=0;
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=s.nextInt();
        a=s.nextInt();
        b=s.nextInt();
        min=b;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                if(min>arr[i])
                {
                    min=arr[i];
                    f++;
                }
            }
        }
        if(f!=0)
            System.out.println(min);
        else
            System.out.println(-1);
    }
}

