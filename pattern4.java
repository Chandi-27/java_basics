import java.util.*;
public class pattern4 {
    public static void main(String args[]){
        int n,count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
