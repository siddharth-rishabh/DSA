package arrays;

public class sortZeroOneTwo {
    public static void main(String[] args){
        int nums[]={1, 0, 2, 1, 0};
        int[] zero = new int[nums.length]; 
         int[] one = new int[nums.length]; 
        int[] two = new int[nums.length]; 
        int sortedNums[]= new int[nums.length];
        int zeroIndex =0, oneIndex=0, twoIndex=0;
        for (int i=0; i< nums.length; i++){
            if(nums[i]==0){
                zero[zeroIndex] =nums[i];
                zeroIndex++;
            }
            else if(nums[i]==1){
                one[oneIndex] =nums[i];
                oneIndex++;
            }
            else if(nums[i]==2){
              two[twoIndex] =nums[i];
                twoIndex++; 
            }

        }
        int index=0;
        for(int i=0; i<zeroIndex; i++){
            sortedNums[index]=zero[i];
            index++;
        }
         for(int j=0; j<oneIndex; j++){
            sortedNums[index]=one[j];
            index++;
        }
         for(int k=0; k<twoIndex; k++){
            sortedNums[index]=two[k];
            index++;
        }
        for(int i=0;i<sortedNums.length; i++){
            System.out.print(sortedNums[i] + ",");
        }

    }
}
