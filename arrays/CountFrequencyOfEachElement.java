import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachElement {
    int arr[] = { 1, 2, 1, 3, 2, 5, 4, 2 };
    HashMap<Integer, Integer> map = new HashMap<>();
    public CountFrequencyOfEachElement(){
   
    for(
    int num:arr)
    {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for(
    Map.Entry<Integer, Integer> entry:map.entrySet())
    {
        System.out.println(entry.getKey() + " repeats " + entry.getValue() + " times");
    }

}     


public static void main(String [] args){
    new CountFrequencyOfEachElement();
}
;
}
