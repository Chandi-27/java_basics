import java.util.Scanner;
public class sumEsumO {
    public static void main(String args[]){
        int n,sumE=0,sumO=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                sumE=sumE+a[i];
            }   
            
            else{
                sumO=sumO+a[i];
            }
            
        }
        System.out.println(sumE);
        System.out.println(sumO);
        sc.close();
        }
}
