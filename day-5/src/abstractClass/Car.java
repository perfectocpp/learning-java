package abstractClass;

public abstract class Car implements Movable {
    int speed;
    public void stop() {
        while (speed > 0) {
            declerate();
        }
    }
    public abstract void declerate();
}
