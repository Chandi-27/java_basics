import java.util.*;
public class assignment1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks<=100 && marks>=90){
            System.out.print("A");
        }
        else if(marks<=90 && marks>=70){
            System.out.print("B");
        }
        else if(marks<=70 && marks>=50){
            System.out.print("C");
        }
        else if(marks<=50 && marks>=30){
            System.out.print("D");
        }
        else {
            System.out.print("Fail");
        }
        sc.close();
    }
}

