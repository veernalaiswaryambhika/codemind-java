import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int su=0;
        for(int i=0;i<n;i++)
        {
        a[i]=s.nextInt();
        su+=a[i];
        }
     System.out.printf("%.2f",(float)su/n);
        
    }
}