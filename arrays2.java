import java.util.*;
public class arrays2 {
    public static void main(String args[]){
        int n;
        int[] marks=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        for(int i=0;i<=n-1;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("phy"+marks[0]);
        System.out.println("che"+marks[1]);
        System.out.println("mat"+marks[2]);
        System.out.println("soc"+marks[2]);
        System.out.println("sci"+marks[2]);
        sc.close();
    }
}

