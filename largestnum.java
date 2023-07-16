public class largestnum {
    public static int getlargest(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){//largest
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
                System.out.println("Smallest number is : "+min);
            }
        }
        //System.out.println("Smallest number is : "+min);
        return max;
    }
    public static void main(String args[]){
        int numbers[]={-1,9,4,6,2,7,5,10};
        System.out.println("Largest number is : "+getlargest(numbers));
        //System.out.println("Smallest number is : "+getlargest(numbers));
    }
}
