import java.util.*;
class sample
{ 
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int sum=0;
         int p=1;
         int r=0;
       while(n!=0)
       {
           r=n%10;
           sum+=r;
           p*=r;
           n=n/10;
       }
     
       System.out.print(p-sum);
    }
}