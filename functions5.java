//prime or not
import java.util.*;
public class functions5 {
    public static void printprime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%2==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        printprime(n);
        sc.close();
    }
}
