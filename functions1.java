import java.util.*;
public class functions1 {
    public static void printSum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        printSum(a,b);
        sc.close();
    }
}
