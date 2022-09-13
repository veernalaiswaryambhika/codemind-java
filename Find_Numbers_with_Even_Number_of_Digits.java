import java.util.*;
class sam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            int d=(int)Math.log10(a[i])+1;
            if(d%2==0)
            c++;
        }
        System.out.println(c);
    }
}