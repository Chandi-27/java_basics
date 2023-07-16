import java.util.*;
public class palindrome {
    public static int isPalindrome(int n){
        int rev=0;
        while(n>0){
            int m=n%10;
            rev=(rev*10)+m;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        n=sc.nextInt();
        int rev=isPalindrome(n);
        System.out.println(rev);
        sc.close();
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        }
    }

