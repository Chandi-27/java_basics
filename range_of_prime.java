import java.util.*;
public class range_of_prime{
    public static void isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n;i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        isPrime(16);
    }

}