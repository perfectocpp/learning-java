package inheritence;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        System.out.println(point.x+", "+point.y);

        Pixel pixel = new Pixel();
        System.out.println(pixel.x+", "+pixel.y+", "+pixel.color);

        int a = pixel.color;


    }
}
