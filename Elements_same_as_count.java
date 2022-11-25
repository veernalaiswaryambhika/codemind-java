
import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int j,n,i,c=0,min,max,f=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        max=0;
        min=a[0];
        for(i=0;i<n;i++)
        {
            c=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]==a[j] && a[j]!=0)
                    {
                        a[j]=0;
                        c++;
                    }
                }
            }
            if(a[i]==c)
            {
                System.out.print(a[i]+" ");
                f++;
            }
        }
        if(f==0)
            System.out.println(-1);
    }
}
