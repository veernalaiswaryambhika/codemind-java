import java.util.*;
class sn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if (n==1 || n==0)
            System.out.println("True");
        else
            for (int i=0;i<n;i++)
                for (int j=0;j<n;j++)
                    if ((i*i)+(j*j)==n){
                        c+=1;
                        if (c==1){
                            System.out.println("True");
                            break;
                        }
                    }
            if (c==0)
                System.out.println("False");
        }
}