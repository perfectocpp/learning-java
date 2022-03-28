package generics;

public class CarWash<T extends Car> {
    public T wash (T car) {
        return car;
    }
}
