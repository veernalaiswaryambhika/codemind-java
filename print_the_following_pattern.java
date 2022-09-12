import java.util.*;
class sam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int t=0;
        for(int i=0;i<r;i++)
        {
             for(int j=1;j<=r;j++)
             {
                 System.out.print((char)(65+i)+" ");
                 
             }
             System.out.println();
            
        }
    }
}