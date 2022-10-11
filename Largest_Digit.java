import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0;
        int rem=0;
       
        while(n!=0)
        {
        rem=n%10;
        if(rem>max)
        {
        max=rem;
        }
        n=n/10;
        
        }
        System.out.print(max);
    }
}