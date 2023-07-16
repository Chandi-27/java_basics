import java.util.*;
public class try {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name=input("Enter a string : ");
        for i in name{
            if(name[i]==name[i+1]){
                System.out.println(i);
            }
        }
    }
}
