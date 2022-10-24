import java.util.*;
class sample
{   
  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
         int c=0;
         int f=0;
       int r=0;
               while(a!=0)
               {
                   r=a%10;
                if(r%2==0)
                f=1;
                else
                c=1;
                a=a/10;
               
            }
            if(f==1&&c==1)
            System.out.println("Mixed");
            if(f==1&&c!=1)
             System.out.println("Even");
             if(f!=1&&c==1)
             System.out.println("Odd"); 
   
    }
}