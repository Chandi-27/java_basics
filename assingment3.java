import java.util.*;
public class assingment3 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number :");
    int n=sc.nextInt();
    if(n==0){
        System.out.println("Entered num is zero");
    }
    else if(n%2==0){
        System.out.println("Entered num is even");
    }
    else{
        System.out.println("Entered num is odd");
    }
    sc.close();
    }
}
