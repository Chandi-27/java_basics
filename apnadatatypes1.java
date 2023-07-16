import java.util.Scanner;
public class apnadatatypes1 {
    public static void main(String args[]){
        /*int a,b,c,sum;
        float avg;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a=sc.nextInt();
        System.out.println("Enter 2st number:");
        b=sc.nextInt();
        System.out.println("Enter 3st number:");
        c=sc.nextInt();
        sum=a+b+c;
        System.out.println(sum);
        avg=sum/3;
        System.out.println(avg);
        sc.close();*/

        int n,count=1;
        float sum=0,avg,m;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(count<=n){
            System.out.println("Enter the numbers that we want to add:");
            m=sc.nextInt();
            sum=sum+m;
            count++;
        }
        avg=sum/n;
        System.out.println(avg);
        sc.close();
    }
}
