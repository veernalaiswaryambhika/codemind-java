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
        int max=0;
        int t=0;
        for(int i=0;i<n;i++)
        {  int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                if(a[i]==a[j])
                c++;
            }
            if(c==0)
           {
       
         System.out.print(a[i]+" ");
         t++;
               
           }
        }if(t==0)
       
          System.out.print("-1");
        
    }
}