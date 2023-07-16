//import java.util.DuplicateFormatFlagsException;
import java.util.Scanner; 
public class areaofcircle {
    public static void main(String args[]){
        float r;
        double area;
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextFloat();
        area=pi*r*r;
        System.out.println(area);
        sc.close();
    }
}
