//binomial coefficient
import java.util.*;
public class functions4 {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bincoeff(int n,int r){
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
        int bc=a/(b*c);
        return bc;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter n value : ");
        n=sc.nextInt();
        System.out.println("Enter r value : ");
        r=sc.nextInt();
        int p=factorial(n);
        int q=bincoeff(n,r);
        System.out.println(p);
        System.out.println(q);
        sc.close();
    }
}
