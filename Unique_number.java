import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[10];
        while(n!=0)
        {
            int r=n%10;
            a[r]++;
            n=n/10;
        }
        int f=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]>1)
            {
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.print("Unique Number");
        else
            System.out.print("Not Unique Number");
    }
}