package oop;

class Point {
    int x;
    int y;

    Point () {
        this.x = 0;
        this.y = 0;
    }

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        System.out.println(point.x+" "+point.y);
    }
}
