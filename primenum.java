import java.util.*;
public class primenum{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n==2){
            System.out.println("Prime");
        }
        else{
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
            }
        }
            if(isprime==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        sc.close();
    }
}
