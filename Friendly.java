import java.util.Scanner;
public class Friendly{
    public static void main(String args[]) {
        int a,b,sum=0,sum1=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=sc.nextInt();
        System.out.println("Enter another number:");
        b=sc.nextInt();
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        int x=sum/a;
        System.out.println(x);
        }
    }
  
