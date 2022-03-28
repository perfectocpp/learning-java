package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("z");
        strings.add("d");
        strings.add("x");
        strings.add("b");

        Collections.sort(strings); // shuffle
        System.out.println(strings);
        for (String string: strings){
            System.out.println(string);
        }

    }
}
