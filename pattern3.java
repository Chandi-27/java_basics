//character pattern
import java.util.*;
public class pattern3 {
    public static void main(String args[]){
        int n;
        char ch='A';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
