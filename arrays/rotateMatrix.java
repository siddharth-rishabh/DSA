public class rotateMatrix {
    public static void transposeMatrix(int nums[][]){

        //transpose of matrix
            
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    int temp =nums[i][j];
                    nums[i][j]= nums[j][i];
                    nums[j][i] = temp;
                };
            };

        //swap rows
        for(int i=0; i<nums.length; i++){
            int start=0;
            int end= nums[i].length-1;
            while(start<end){
                int temp = nums[i][start]; 
                nums[i][start] = nums[i][end];
                nums[i][end] = temp;
                start++;
                end--;
            };
        };

        //print matrix
        for (int i=0; i<nums.length; i++){
            for(int j=0; j< nums.length; j++){
                System.out.print(nums[i][j]+" ");
            };
            System.out.println("");
        };

    };

    public static void main(String [] args){
        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transposeMatrix(nums);
        
    };
};
