import java.util.*;

public class firstElementOccuredTwice {
    int arr[] = { 5, 5, 2, 1, 2, 3 };
    
    HashSet<Integer> set = new HashSet<>();
    public firstElementOccuredTwice(){
        for(int num: arr){
          if(set.contains(num)) {
            System.out.println("First Repated no :- " + num);
            return;
          } else{
            set.add(num);
          }
          
        };
        System.out.println("No Number is repeated twice");
    };

    public static void main(String[] args) {
        new firstElementOccuredTwice();
    };

}
