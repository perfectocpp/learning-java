import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
    int[] numbers = {12, 23, 59, 6, 6,23, 12, 12};
    HashMap<Integer, Integer> map = new HashMap<>();        
    
    for (int num: numbers) {
        map.put(num, 0);
            for (int num1: numbers){
                if (num == num1){
                    map.put(num, map.get(num) + 1);
                }
                     
            }
             
        }

        System.out.println(map);
    }

}

