import java.util.*;
class Sample
{
    public static boolean isprime(int n)
   { 
      if(n==1)
      return false;
    for(int i=2;i<=Math.sqrt(n);i++)
    {
       if(n%i==0)
       return false;
    }
     return true;
  }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=s.nextInt();
            int c=0;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if(isprime(a[i]))
                {
                c++;
                 sum+=a[i];
                }
                
            }
            double avg=((double)sum)/c;
            System.out.printf("%.2f",avg);
            
        
    }
}