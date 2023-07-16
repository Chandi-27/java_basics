import java.util.Scanner;
public class greatestof2 {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter a number:");
        b=sc.nextInt();
        System.out.println("Enter another number:");
            if(a>b){
                System.out.println(a);
            }
            else if(b>a){
                System.out.println(b);
            }
            else{
                System.out.println("equal");
            }
            sc.close();
    }
}
