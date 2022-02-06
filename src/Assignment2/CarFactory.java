package Assignment2;

public class CarFactory {

    public CarInfo buildCar(CarType type) {
        CarInfo carInfo = null;
        switch (type) {
            case BMW:
                carInfo = new BMW();
                break;
            case Ford:
                carInfo = new Ford();
                break;
            case Mazda:
                carInfo = new Mazda();
                break;
            case Toyota:
                carInfo = new Toyota();
                break;
            default:
        }
        return carInfo;
    }
}
