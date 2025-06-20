package arrays;

public class printSubArrays {
    public static void main(String []args){
        int arr[]={2,4,6,8,10};
        for (int i=0; i<arr.length;i++){
            int start =i;
            for(int j=1; j<arr.length; j++){
                int last=j;
                for(int k=start; k<=last ; k++){
                    System.out.print(arr[k] +" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        // System.out.println("");
        }
}
