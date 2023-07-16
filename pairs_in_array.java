public class pairs_in_array {
    public static void getpairs(int numbers[]){
        int total=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                total++;
            }
            System.out.println();
        }
        System.out.println("total pairs formed are"+total);
    }
    public static void main(String args[]){
        int numbers[]={2,1,8,9,3,5};
        getpairs(numbers);
    }
}
