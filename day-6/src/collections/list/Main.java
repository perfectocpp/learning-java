package collections.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arrayList();
        linkedList();
    }
    public static void arrayList(){
        List<Integer>  integers = new ArrayList<>();

        Date startDate = new Date();
        for (int i = 0; i <= 1_000_000; i++){
            integers.add(i);
        }
        Date endDate = new Date();
        System.out.println(endDate.getTime()-startDate.getTime());
    }

    public static void linkedList(){
        List<Integer>  integers = new LinkedList<>();

        Date startDate = new Date();
        for (int i = 0; i <= 100_000; i++){
            integers.add(i);
        }
        Date endDate = new Date();
        System.out.println(endDate.getTime()-startDate.getTime());
    }
}
