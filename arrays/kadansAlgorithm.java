package arrays;

public class kadansAlgorithm {
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            sum= sum+numbers[i];
            
            if(sum<0){
                sum=0;
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
