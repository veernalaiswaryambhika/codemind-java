import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int l;
        for(l=0;l<m;l++)
        {
            int n=s.nextInt();
            int k,j,t;
            int v[]=new int[n];
            int r[]=new int[n];
            for(k=0;k<n;k++)
                v[k]=s.nextInt();
            for(k=0;k<n;k++)
                r[k]=v[k];
            for(j=0;j<n-1;j++)
            {
                for(k=0;k<n-1;k++)
                {
                    if(v[k]>v[k+1])
                    {
                        t=v[k+1];
                        v[k+1]=v[k];
                        v[k]=t;
                    }
                }
            }
            t=0;
            for(k=0;k<n;k++)
            {
                if(v[k]!=r[k])
                {
                    t=1;
                }
            }
            if(t==1)
            {
                t=v[n-1]-v[0];
            }
            System.out.println(t);
                
        }
    }
}
