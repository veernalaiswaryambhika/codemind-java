import java.util.*;
class sol
{
    public static boolean perfect(int n)
    {
        int t=1;
        for(int i=2;i<=(int)n/2;i++)
        {
            if(n%i==0)
            t=t+i;
        }
        if(t==n)
        return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       if(perfect(n)==true)
        System.out.println("True");
        else 
            System.out.println("False");
       
    }
}