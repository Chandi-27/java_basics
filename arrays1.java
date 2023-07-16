//import java.util.*;
public class arrays1 {
    public static void update(int marks[],int unchanged){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        unchanged=10;
        //System.out.println();
    }
    public static void main(String args[]){
        int marks[]={12,34,56};
        int unchanged=19;
        update(marks,unchanged);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }  
        System.out.println(); 
        System.out.println(unchanged);  
    }
}
