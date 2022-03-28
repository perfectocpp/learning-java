package Interface;

public class Car implements Movable{
    int speed;

    public void move (){
        this.speed += 10;
    }

    public void stop (){
        this.speed = 0;
    }

    public void testing() {

    }
}
