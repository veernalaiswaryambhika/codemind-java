import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int k=s.nextInt();
        for(int i=1;i<=k;i=i+2)
        {
           
            System.out.println(t+" x "+i+" = "+t*i);
        }
    }
}