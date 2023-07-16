import java.util.Scanner;
public class automorphic {
    public static void main(String args[]){
        int n,m,x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        m=n*n;
        System.out.println(m);
        x=m%10;
        y=n%10;
        if(x==y){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
        sc.close();
    }
}
