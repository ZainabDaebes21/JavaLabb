package Assignment2;

import java.util.Random;

public class Ford implements CarInfo {

    private int id;

    public Ford() {
        Random random = new Random();
        this.id = random.nextInt(101201020,909839272);
    }

    @Override
    public String info() {
        return "A brand new Ford was created, with an id of: " + this.id ;
    }
}
