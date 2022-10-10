import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        int sum=0;
        int sum1=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            sum+=i;
        }
          for(int i=1;i<=n1/2;i++)
        {
            if(n1%i==0)
            sum1+=i;
        }
        if(n==sum1)
        System.out.print("Amicable");
        else
         System.out.print("Not Amicable");
    }
}