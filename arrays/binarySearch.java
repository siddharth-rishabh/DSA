package arrays;

import java.util.*;

public class binarySearch {

    public static int keyFind(int numbers[], int key){
        int start =0;  
        int end = numbers.length;
        
        while(start<=end){
            int mid = (start+end)/2;

            if(key == numbers[mid]){
            return mid;            
            };
            if(key< numbers[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            };
            
        }
        return -1;

    }
    public static void main(String[] args){
        int numbers[] = {4, 10, 17, 26, 38, 59, 71, 83, 92};
        System.out.println("Which no you want to find?");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        // key = 17;

        System.out.println("Your entered Number is at " + keyFind(numbers, key) +" Position");

    }
}
