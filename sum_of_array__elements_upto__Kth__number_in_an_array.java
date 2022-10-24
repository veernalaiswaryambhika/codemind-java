import java.util.*;
class sam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int k=s.nextInt();
        int su=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k)
            {
                su+=a[i];
            }

        }
                    System.out.print(su);
    }
}