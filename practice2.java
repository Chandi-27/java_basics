import java.util.*;
public class practice2{
    public static void main(String args[]){
        int n,i,sume=0,sumo=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                sume=sume+i;
            }
            else{
                sumo=sumo+i;
            }
        }
        System.out.println("sum of even"+sume);
        System.out.println("sum of odd"+sumo);
        sc.close();
    }
}