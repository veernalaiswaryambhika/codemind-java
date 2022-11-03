import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
            HashMap<Integer,Integer> ob=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            ob.put(a[i],ob.getOrDefault(a[i],0)+1);
        }
        int c=0;
        for(Map.Entry ele:ob.entrySet())
        {   
            if(ele.getValue()==ele.getKey())
            c++;
    }
    System.out.print(c);
    }
}
