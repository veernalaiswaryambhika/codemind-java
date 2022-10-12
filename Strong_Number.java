import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        int t=n;
       
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            int f=1;
            while(rem!=0)
            {
               f=f*rem;
               rem--;
            }
            sum+=f;
        }
        if(t==sum)
        System.out.print("The number "+t+" is a strong number");
        else
        System.out.print("The number "+t+" is not a strong number");
    }
}