import java.util.*;
public class array2 {
    public static void main(String args[]){
        int marks[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many do you want to enter");
        int n=sc.nextInt();
        System.out.print("Enter the elements : ");
        for(int i=0;i<n-1;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the elements in the array are : ");
        for(int i=0;i<n-1;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Enter key :");
        int key=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(marks[i]==key){
                System.out.println("key found at index"+i);
                break;
            }
            else{
                System.out.println("key not found at index"+i);
            }
        sc.close();
    }
}
}
