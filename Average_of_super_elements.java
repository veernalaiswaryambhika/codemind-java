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
        int su=0;
        for(Map.Entry<Integer,Integer> ele:ob.entrySet())
        {
            if(ele.getKey()==ele.getValue())
            {
            c++;
            su+=(int)ele.getKey();
            }
           
        } if(c>0)
        {
         double avg=((double)su)/c;
         System.out.printf("%.2f",avg);
        }
         else
           System.out.print("-1");
    }
}