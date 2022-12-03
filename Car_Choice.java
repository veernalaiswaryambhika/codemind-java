import java.util.Scanner;
import java.lang.Math;
class avg{
    public static void main(String args[]){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int v,k;
            float r,s;
            v=sc.nextInt();
            k=sc.nextInt();
            r=sc.nextFloat();
            s=sc.nextFloat();
            if(((float)r)/v>((float)s)/k){
                System.out.println(1);
            }
            else if(((float)r)/v<((float)s)/k){
                System.out.println(-1);
            }
            else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}