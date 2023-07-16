/*import java.util.Scanner;
public class Continue {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}*/

import java.util.Scanner;
public class Continue {
    public static void main(String args[]){
    //int counter=0;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n%10==0){
            continue;
            //counter++;
        }
        System.out.println(n);
        //counter++;
    }while(true);
    // sc.close();
}
}
