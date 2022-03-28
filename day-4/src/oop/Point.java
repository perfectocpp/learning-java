package oop;

public class Point {
    // static funksiya yoki classning funcsiyasi
    // boshqa xotirada saqlanadi, objectlarda chairib bo'lmaydi
    static void test(){
        System.out.println("test");
    }

    int x;
    int y;

    // constructor
    Point(){ this(0, 0); }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void change(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void printDetails () {
        System.out.printf("(%d; %d)\n", x, y);
    }

    public String toString(){
        return "("+x + "; " + y + ")";
    }
}
