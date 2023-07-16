public class binary_search {
    public static int getbinary(int numbers[]){
        int key=10;
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
         }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,1,9,7,10,8};
        System.out.println(getbinary(numbers));
    }
}

