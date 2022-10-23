import java.util.*;
class sample
{  
    public static boolean isprime(int m)
  {
    for(int i=2;i<=(int)Math.sqrt(m);i++)
    {
        if(m%i==0)
        return false;
       
    }
 
        return true;
}
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
     int f=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      a[i]=s.nextInt();
          int k=s.nextInt();
      HashMap<Integer,Integer> ob=new HashMap<>();
            for(int i=0;i<n;i++)
        {
          ob.put(a[i],ob.getOrDefault(a[i],0)+1);
      }
        for(Map.Entry<Integer,Integer> ele:ob.entrySet())
        {
            if(ele.getValue()==k)
            {
                f++;
           System.out.print((int)ele.getKey()+" ");
            
            }
        }
        if(f==0)
         System.out.print("-1");
         
    
        
    }
}