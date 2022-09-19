import java.util.*;
class Sample
{   public static int max(int a[],int x)
{
    int m=a[x+1];
    for(int i=x+1;i<a.length;i++)
    {
    if(m<a[i])
    m=a[i];
    }
    return m;
}
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n-1;i++)
        System.out.print(max(a,i)+" ");
        System.out.print("-1");
    }
}