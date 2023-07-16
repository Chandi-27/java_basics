import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        year=sc.nextInt();
        if(((year%4==0) && (year%100!=0))||(year%400==0)){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not leap year");
        }
        sc.close();
    }
}
    
    

