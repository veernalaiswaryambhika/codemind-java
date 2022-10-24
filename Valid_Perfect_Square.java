import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int a=s.nextInt();
            int sq=(int)Math.sqrt(a);
            if(sq*sq==a)
            System.out.println("True");
            else
              System.out.println("False");
        }
    }
}