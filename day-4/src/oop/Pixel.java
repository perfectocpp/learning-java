package oop;

public class Pixel extends Point {
    int color;

    Pixel() { this(0, 0); }

    Pixel(int x, int y){
        this(x, y, 0);
    }

    Pixel(int x, int y, int color){
        super(x, y);
        this.color = color;
    }

    void change(int x, int y, int color) {
        super.change(x, y);
        this.color = color;
    }

    // overriding
    @Override
    public void printDetails () {
        System.out.printf("(%d; %d) -> %d\n", x, y, color);
    }

    @Override
    public String toString(){
        return String.format("(%d, %d), %d", x, y, color);
    }
}
