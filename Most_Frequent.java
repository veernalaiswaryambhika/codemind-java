import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int max=0;
        int key=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(a[i],h.getOrDefault(a[i],0)+1);
            
        }
       int sum=0;
       for(Map.Entry e:h.entrySet())
       {
          if((int)e.getValue()>max)
          {
          max=(int)e.getValue();
          key=(int)e.getKey();
          }
       }
       System.out.print(key);
    
    }
}