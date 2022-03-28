package Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println(car.speed);

        Animal bear = new Animal();
        bear.move();
        System.out.println(bear.step);
    }
}
