import java.util.Scanner;
public class sumofdigits {
    public static void main(String args[]){
        int n,m,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        while(n>0){
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
        }
    }

