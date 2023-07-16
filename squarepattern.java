import java.util.Scanner;
public class squarepattern {
    public static void main(String args[]){
        int n,count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        /*for(int i=1;i<=n;i++){
            System.out.println("* * * *");
        }*/
        while(count<=n){
            System.out.println("* * * *");
            count++;
        }
        sc.close();
    }
}
