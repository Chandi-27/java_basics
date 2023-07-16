//area of square
import java.util.Scanner;
public class apna2 {
    public static void main(String args[]){
    int a;
    float area;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length:");
    a=sc.nextInt();
    /*System.out.println("Enter breadth:");
    b=sc.nextInt();*/
    area = a*a;
    System.out.println(area);
    sc.close();
    }
}
