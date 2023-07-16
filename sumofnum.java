import java.util.Scanner;
public class sumofnum {
    public static void main(String args[]){
        int n,count=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(count<=n){
            sum=sum+count;
            //System.out.println(sum);
            count++;
        } 
        System.out.println(sum);    
        sc.close();
    }
}
