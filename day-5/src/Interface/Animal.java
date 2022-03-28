package Interface;

public class Animal implements Movable{
    int step;
    int speed;
    public void move (){
        this.step++;
        this.speed = 5;
    }

    public void stop (){
        this.speed = 0;
    }
    public void testing() {

    }
}
