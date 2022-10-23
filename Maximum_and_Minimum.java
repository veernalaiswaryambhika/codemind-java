import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int f=0;
        
        
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int min=a[n-1];
        int max=a[0];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ele:h.entrySet())
        {   
            if(ele.getKey()==ele.getValue())
            {
              if(max<(int)ele.getKey())
              max=(int)ele.getKey();
              if(min>(int)ele.getKey())
              min=(int)ele.getKey();
              f=1;
            }
          
                
        }
       
         if(f==1)
          System.out.print(min+" "+max);
          else
           System.out.print("-1");
       
    }
}