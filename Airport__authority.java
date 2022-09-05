import java.util.Scanner;
class Sample
{
    public static int th(int n,int a[],int t)
    {  int c=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]<=t)
        c++;
        else 
        c=c+2;
      }
        return c;    
        
    }


    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
     
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
           int t=s.nextInt();
        int w=th(n,a,t);
        System.out.print(w);
    }
}