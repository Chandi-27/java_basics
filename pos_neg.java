import java.util.Scanner;
public class pos_neg {
   public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num:");
    n=sc.nextInt();
    if(n>0){
        System.out.println("positive");
    }
    else if(n<0){
        System.out.println("negative");
    }
    else{
        System.out.println("zero");
    }
    sc.close();
   } 
}
