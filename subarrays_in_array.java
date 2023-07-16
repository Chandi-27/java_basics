public class subarrays_in_array {
    public static void getsubarrays(int numbers[]){
        int total=0,sum=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]);
                    sum=sum+numbers[k];
                }
                total++;
                System.out.println("the sum of the each sub array is :"+sum);
                System.out.println();
                //System.out.print("the sum of the each sub array is :"+sum);
            }
            System.out.println();
        }
        System.out.println(total);
        }
    
    public static void main(String args[]){
        int numbers[]={2,8,1,5,9};
        getsubarrays(numbers);
    }
}
