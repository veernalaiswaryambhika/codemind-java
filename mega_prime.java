import java.util.*;
class sample
{   
    public static boolean isprime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int m=s.nextInt();
       
       if(isprime(m))
       {   int f=0;
           while(m!=0)
           {
               int r=m%10;
               if(r==1)
               f=1;
               if(isprime(r))
               m=m/10;
               else
               {
              f=1;
              break;
               }
           }
           if(f==1)
            System.out.println("Not Mega Prime");
            else
             System.out.println("Mega Prime");
       }
        else
               System.out.println("Not Mega Prime");
    }
}