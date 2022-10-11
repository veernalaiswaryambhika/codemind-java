import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int t=(int)Math.sqrt(n1);
        if(t*t==n1)
        System.out.print("True");
        else
          System.out.print("False");
    }
}