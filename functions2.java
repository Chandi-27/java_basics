import java.util.*;
public class functions2 {
    public static int printproduct(int x,int y){
        int prod=x*y;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=printproduct(a,b);
        System.out.println(mul);
        sc.close();
    }
}
