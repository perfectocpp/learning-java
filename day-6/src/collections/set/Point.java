package collections.set;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin(){return Math.hypot(x, y);}
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x && this.y == o.y) {
            return 0;
        }else {
            return (int) (this.distanceFromOrigin() - o.distanceFromOrigin());
        }

    }
}
