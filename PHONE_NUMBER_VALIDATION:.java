import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
       int l=(int)Math.log10(n)+1;
        if(l==10)
        {
             System.out.print("Valid");
        }
        else
         System.out.print("Invalid");
        
    }
}