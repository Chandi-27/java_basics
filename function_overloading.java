//having same fun names but with diff parameters
import java.util.*;
public class function_overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a=sc.nextInt();
        System.out.print("Enter b value : ");
        int b=sc.nextInt();
        System.out.print("Enter c value : ");
        int c=sc.nextInt();
        int p=sum(a,b);
        int q=sum(a,b,c);
        System.out.println(p);
        System.out.println(q);
        sc.close();
    }
}
