import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int j,n,i,cnt=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        
       
        for(i=0;i<n;i++)
        {
            cnt=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]==a[j] && a[j]!=0)
                    {
                        a[j]=0;
                        cnt++;
                    }
                }
            }
            if(a[i]!=0)
                System.out.print(a[i]+" "+cnt+" ");
        }
    }
}
