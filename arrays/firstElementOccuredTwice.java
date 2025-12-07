import java.util.*;

public class firstElementOccuredTwice {
    int arr[]= {2, 5, 1, 2, 3, 5};
    HashMap<Integer, Integer> map = new HashMap<>();

    public firstElementOccuredTwice(){
        for(int num: arr){
           map.put(num, map.getOrDefault(num, 0)+1);
        };
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() >= 2){
                System.out.println(entry.getKey());
            }
        }
    };

    public static void main(String [] args){
        new firstElementOccuredTwice();
    }
    
}
