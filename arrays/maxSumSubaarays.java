package arrays;

public class maxSumSubaarays {
    public static void main(String []args){
        int maxSum=0;
        int sum=0;
        int arr[]={2,4,6,8,10};
        for (int i=0; i<arr.length;i++){
            int start =i;
            sum=0;
            for(int j=1; j<arr.length; j++){
                int last=j;
                sum =0;
                for(int k=start; k<=last ; k++){
                    sum = sum + arr[k];
                    System.out.println(sum);
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println("The maximum sum is :"+maxSum);
    }
}
