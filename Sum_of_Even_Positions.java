import java.util.*;
class Sammple
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int ss=0;
        int s1=0;
        for(int i=0;i<n;i++)
        {
        a[i]=s.nextInt();
        if(i%2==0)
            ss+=a[i];
           
        }
       
        System.out.print(ss);
    }
}