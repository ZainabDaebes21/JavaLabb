package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<CarInfo> carInfos = new ArrayList<>();
        carInfos.add(carFactory.buildCar(CarType.BMW));
        carInfos.add(carFactory.buildCar(CarType.Ford));
        carInfos.add(carFactory.buildCar(CarType.Mazda));
        carInfos.add(carFactory.buildCar(CarType.Toyota));

        carInfos.forEach(car -> System.out.println(car.info()));

    }
}