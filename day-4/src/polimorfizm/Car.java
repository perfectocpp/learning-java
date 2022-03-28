package polimorfizm;

public class Car {
    String model;
    String color;

    int maxSpeed;
    int speed;

    Car(String model, String color){
        System.out.printf("\n\n%s is has created whit %s color\n", model, color);
        this.model = model;
        this.color = color;

    }

    void start (){
        System.out.printf("%s is started; speed: %d km/h\n", model, speed);
        if (speed == 0) {
            speed = getAcceleration();
        }
    }

    void accelerate () {
        System.out.printf("%s is accelerated; speed: %d km/h\n", model, speed);
        speed += getAcceleration();
        if (speed >= getMaxSpeed()){
            speed = getMaxSpeed();
        }
    }

    void decelerate(){
        System.out.printf("%s is decelerated; speed: %d km/h\n", model, speed);
        if (speed >= getAcceleration()){
            speed -= getAcceleration();
        } else {
            speed = 0;
        }
    }

    void stop () {
        while (speed > 0){
            System.out.printf("%s is stopping ... ; speed: %d km/h\n", model, speed);
            decelerate();
        }
    }

    int getAcceleration(){
        return 5;
    }

    int getMaxSpeed(){
        return 200;
    }

}
