//sum of total goods using 18% gst
import java.util.Scanner;
public class apna3 {
    public static void main(String args[]){
        int a,b,c,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of pencil:");
        a=sc.nextInt();
        System.out.println("Enter cost of pen:");
        b=sc.nextInt();
        System.out.println("Enter cost of eraser:");
        c=sc.nextInt();
        sum=a+b+c;
        System.out.println(sum);
        double newcost = sum+(0.18*sum);
        System.out.println(newcost);
        sc.close();


    }
}
