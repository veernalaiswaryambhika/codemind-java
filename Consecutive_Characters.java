import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
      int c=1;
        int max=1;
        for(int i=0;i<st.length()-1;i++)
        {  
            if(st.charAt(i)==st.charAt(i+1))
            c++;
            else
            c=1;
            if(c>max)
            max=c;
        }
        System.out.print(max);
      
        
    }
}