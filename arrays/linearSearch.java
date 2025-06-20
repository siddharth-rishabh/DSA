package arrays;

import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        // String menu = 
        String menu[] = {"chicken biryani", "daal", "chawal", "aaloo", "DumBiryani"};
        System.out.println("What do you want? sir");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
         
        for(int i =0; i<menu.length; i++){
            if(choice.equals(menu[i])){
                System.out.println("Yes sir "+ choice + " is available...");
            }
        }

    



    }
}


