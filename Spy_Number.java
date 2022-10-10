import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        int sum=0;
        int pro=1;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        if(sum==pro)
        System.out.print("Spy Number");
        else
         System.out.print("Not Spy Number");
    }
}