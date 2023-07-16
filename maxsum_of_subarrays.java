public class maxsum_of_subarrays {
    public static void getmax(int numbers[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j;
                curSum=0;
                for(int k=start;k<=end;k++){
                    curSum=curSum+numbers[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("maxSum : "+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={2,5,6,7};
        getmax(numbers);
    }
}