import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0 || a[i]==1)
                continue;
            else
            {
                f=1;
                break;
            }
            
        }
        if(f==0)
            System.out.println("True");
        else
            System.out.println("False");
        
        
    }
}