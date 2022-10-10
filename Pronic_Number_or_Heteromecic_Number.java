import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n2=(int)Math.sqrt(n);
        if(n2*(n2+1)==n)
        System.out.print("YES");
        else
         System.out.print("NO");
    }
}