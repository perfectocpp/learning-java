package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        /*hashSet();
        hashSet_1();
        linkedHashSet_1();*/
        treeSet();
    }

    // Set_1
    public static void hashSet() {
        Set<String> strings = new HashSet<>();
        strings.add("Alex");
        strings.add("Bob");
        strings.add("David");
        System.out.println(strings.size());

        strings.remove("Bob");
        System.out.println(strings.size());
    }
    public static void hashSet_1() {
        Set<Point> points = new HashSet<>();

        points.add(new Point(3,  4));
        points.add(new Point(6,  8));
        points.add(new Point(12,  16));

        for (Point point: points){
            System.out.println(point);
        }

    }
    public static void linkedHashSet_1() {
        Set<Point> points = new LinkedHashSet<>();

        points.add(new Point(3,  4));
        points.add(new Point(6,  8));
        points.add(new Point(12,  16));

        for (Point point: points){
            System.out.println(point);
        }
    }

    public static void treeSet() {
        Set<Point> points = new TreeSet<>();

        points.add(new Point(3,  4));
        points.add(new Point(6,  8));
        points.add(new Point(12,  16));

        for (Point point: points){
            System.out.println(point);
        }

    }
}


