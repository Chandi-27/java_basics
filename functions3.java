import java.util.*;
public class functions3 {
    public static int printfunction(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int factorial=printfunction(n);
        System.out.println(factorial);
        sc.close();
    }
}
