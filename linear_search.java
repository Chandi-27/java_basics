//import java.util.*;
public class linear_search {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            //System.out.println();
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,9,5,7,1,6,56,14,90,2,34};
        int key=5;
        int index=linearsearch(numbers,key);
        if(index==-1){
            System.out.print("key not found");
        }
        else{
            System.out.print("key found at"+index);
        }
        }
    }

 

