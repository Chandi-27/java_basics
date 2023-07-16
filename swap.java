import java.util.Scanner;
public class swap {
    public static void printswap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping : ");
        //System.out.println(b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        printswap(a,b);
        System.out.println("In main method/function call");
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
