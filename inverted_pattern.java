/* 12345
 * 1234
 * 123
 * 12
 * 1
 */
import java.util.*;
public class inverted_pattern {
    public static void pattern(int n){
        //int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
}
