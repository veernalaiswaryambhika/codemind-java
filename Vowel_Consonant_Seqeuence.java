import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String v="aeiouAEIOU";
        int n=str.length();
        char c[]=new char[n];
       
       for(int i=0;i<n;i++)
        {
            if(v.contains(str.charAt(i)+""))
                c[i]='V';
            else
                c[i]='C';
        }
        for(int i=0;i<n-1;i++)
        {
            if(c[i]!=c[i+1])
                System.out.print(c[i]);
        }
        System.out.print(c[n-1]);
    }
}
   