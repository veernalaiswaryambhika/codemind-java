import java.util.*;
class sample
{
    public static boolean ispal(String s2)
    {   
        int n=s2.length();
        int i=0,j=n-1;
        while(i<j)
        {
            if(s2.charAt(i)!=s2.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void minmax(String s3)
    {
        String v="aeiouAEIOU";
        char min='u';
        char max='a';
        int flag=0;
        for( int i=0;i<s3.length();i++)
        {
            if(v.contains(s3.charAt(i)+""))
            {
                flag=1;
                if(s3.charAt(i)>max)
                max=s3.charAt(i);
                if(s3.charAt(i)<min)
                min=s3.charAt(i);
            }
           
            
        }
        if(flag==0)
        System.out.println("-1"+" "+"-1");
        else
         System.out.println(min+" "+max);
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        {
            String s1=s.nextLine();
            String str[]=s1.split(" ");
            for(int i=0;i<str.length;i++)
            if(ispal(str[i]))
            {
                minmax(str[i]);
            }
        }
    }
}