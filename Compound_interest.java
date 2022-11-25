import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        double x=1+(r/100.0d);
        double v=Math.pow(x,t);
        double a=p*v;
        System.out.printf("%.2f",a);
    }
}
