import java.util.*;
public class binary_to_decimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int decimal=0;
        int pow=0;
        while(n>0){
            int ld=n%10;
            decimal=decimal+(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(decimal);
        sc.close();
    }
}
