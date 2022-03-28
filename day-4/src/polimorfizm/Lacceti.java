package polimorfizm;

public class Lacceti extends Car {
    Lacceti (String model, String color) {
        super(model, color);
    }

    @Override
    int getAcceleration() {
        return 10;
    }

    int getMaxSpeed(){
        return 240;
    }

    void turnOnAirConditioner(){
        System.out.println("air conditioner is turned ON!\n");
    }
}
