import java.util.Scanner;
public class abudant {
    public static void main(String args[]){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum>n){
            System.out.println("Abudant");
        }
        else{
            System.out.println("Not Abudant");
        }
        sc.close();
    }
}
