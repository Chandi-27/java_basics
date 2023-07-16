import java.util.Scanner;
public class harshad{
    public static void main(String args[]){
        int n,m,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=s.nextInt();
        while(n>0){
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
        System.out.println(sum);
        if(n%sum==0){
            System.out.println("Harshad");
        }
        else{
            System.out.println("Not Harshad");
         }
         s.close();
     }
}
