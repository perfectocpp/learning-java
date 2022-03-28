package polimorfizm;

public class Nexia extends Car {

    Nexia (String model, String color) {
        super(model, color);
    }
    @Override
    int getAcceleration() {
        return 7;
    }

}
