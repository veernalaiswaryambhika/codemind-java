import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       
         int   a=s.nextInt();
         int c=s.nextInt();
         int cap=(2*a*n*c*512)/1024;
            
        
        System.out.println(cap+"KB");
        
    }
}