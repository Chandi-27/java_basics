import java.util.*;
public class builtin_fun {
    public static void printFun(int a,int b){
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println((int)Math.sqrt(a));
        System.out.println(Math.pow(a,b));
        //System.out.print(Math.avg(a,b));
        System.out.println(Math.absExact(a));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        System.out.print("Enter another number : ");
        int b=sc.nextInt();
        printFun(a,b);
        sc.close();
    }
}
