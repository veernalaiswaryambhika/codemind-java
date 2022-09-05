import java.util.*;
class sol
{
    public static void rotate(int a[],int x,int y)
    {
        int i=x;
        int j=y;
        while(i<j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public static void move(int n,int a[],int k)
    {
        if(n==1 || n==k)
            return;
            k=k%n;
        rotate(a,n-k,n-1);
        rotate(a,0,n-k-1);
        rotate(a,0,n-1);
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int k=s.nextInt();
        move(n,a,k);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}