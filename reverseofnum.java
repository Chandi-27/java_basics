import java.util.Scanner;
public class reverseofnum {
    public static void main(String args[]){
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(n>0){
            int m = n%10;
            //rev = rev*10+m;
            //we can also write print statement for m instead of using the above formula
            System.out.print(m);
            n=n/10;
        }
        /*for(i=1;i<n;i++){
            int m = n%10;
            i = i*10+m;
            n=n/10;
        }*/
        System.out.println(rev);
        sc.close();
    }
}
