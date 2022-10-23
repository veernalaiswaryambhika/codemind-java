import java.util.*;
class sample
{  
    public static boolean isprime(int m)
  {
    for(int i=2;i<=(int)Math.sqrt(m);i++)
    {
        if(m%i==0)
        return false;
       
    }
 
        return true;
}
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
     
        int f=0;
        
        if(isprime(n))
        {
           while(n!=0)
           {
               int r=n%10;
               if(r==1)
               {
                   f=1;
                   break;
               }
               if(isprime(r))
               n=n/10;
               else
               {
                   f=1;
                   break;
               }
           }
           if(f==0)
            System.out.print("Mega Prime");
             else
        System.out.print("Not Mega Prime"); 
        }
        else
        System.out.print("Not Mega Prime");
            
            
        
    }
}