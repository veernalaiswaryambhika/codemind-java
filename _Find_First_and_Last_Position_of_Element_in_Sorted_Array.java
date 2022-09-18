import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int t=s.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
           if(a[i]==t)
           {
           
            System.out.print(i+" ");
            flag++;
            break;
           }
        
        
            }
             for(int i=n-1;i>=0;i--)
        {
           if(a[i]==t)
           {
           
            System.out.print(i+" ");
            flag++;
            break;
           }
        
        
            }
            if(flag==0)
            System.out.print("-1"+" "+"-1");
    }
}