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
        int x=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
             if(a[i]==a[j])
             {
             x=a[i];
             break;
             }
            }
            if(x!=0)
            break;
           
        }
         System.out.print(x);
    }
}
    