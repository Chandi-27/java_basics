/*import java.util.*;
public class Break {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%10==0){
                break;
            }
            System.out.println(i);
            sc.close();
        }
    }
}*/

import java.util.Scanner;
public class Break{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter your number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
        sc.close();
    }
}
